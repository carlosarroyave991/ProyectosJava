import { ClienteService } from 'src/app/services/cliente.service';
import { Cliente } from './../../models/cliente';
import { Component, OnInit, ViewChild } from '@angular/core';
import { MatPaginator, PageEvent } from '@angular/material/paginator';
import swal from 'sweetalert2'

@Component({
  selector: 'app-clientes',
  templateUrl: './clientes.component.html',
  styleUrls: ['./clientes.component.css']
})
export class ClientesComponent implements OnInit {

  titulo = 'Listado de Clientes';
  clientes: Cliente[];

  totalRegistros = 0;
  paginaActual = 0;
  totalPorPagina = 4;
  pageSizeOptions: number[] = [5, 10, 25, 100];

  @ViewChild(MatPaginator) pagginador: MatPaginator;


  constructor(private service: ClienteService) { }

  ngOnInit(): void {
    this.calcularRangos();
  }

  paginar(event: PageEvent): void{
    this.paginaActual = event.pageIndex;
    this.totalPorPagina = event.pageSize;
    this.calcularRangos();
  }

  private calcularRangos(){
    this.service.listarClientes(this.paginaActual.toString(), this.totalPorPagina.toString()).subscribe(clientes => {
      this.clientes = clientes.content as Cliente[];
      this.totalRegistros = clientes.totalElements as number;
      //this.pagginador._intl.itemsPerPageLabel = 'Registros por Página: ';
    })
  }

  eliminar(cliente: Cliente): void{

    swal.fire({
      title: 'Cuidado',
      text: `¿Estás seguro de eliminar el cliente ${cliente.name}?`,
      icon: 'warning',
      showCancelButton: true,
      confirmButtonColor: '#3085d6',
      cancelButtonColor: '#d33',
      confirmButtonText: 'Si, eliminar!'
    }).then((result) => {
      if (result.isConfirmed) {
        this.service.eliminar(cliente.clientId).subscribe(() => {
          this.clientes = this.clientes.filter(c => c !== cliente);
          swal.fire('Cliente Eliminado', `El cliente ${cliente.name} ${cliente.lastname} fue eliminado con éxito`, 'success');
        }, err => {
          if(err.status == 500){
            swal.fire('Notificación', `El cliente ${cliente.name} ${cliente.lastname} no puede ser eliminado porque tiene ventas asociadas`, 'info');
          }
        });
      }
    });
  }

  cambiarEstado(cliente: Cliente): void{
    let mensaje: string;
    if(cliente.active){
      mensaje = 'desactivar'
    }else{
      mensaje = 'activar'
    }

    swal.fire({
      title: 'Cuidado',
      text: `¿Estás seguro de ${mensaje} el cliente ${cliente.name} ${cliente.lastname}?`,
      icon: 'warning',
      showCancelButton: true,
      confirmButtonColor: '#3085d6',
      cancelButtonColor: '#d33',
      confirmButtonText: `Si, ${mensaje}!`
    }).then((result) => {
      if (result.isConfirmed) {
        cliente.active = !cliente.active;
        this.service.editar(cliente).subscribe(() => {
          swal.fire('Alert', `El cliente ${cliente.name} ${cliente.lastname} fue ${mensaje} con éxito`, 'success')
        });
      }
    });
  }

}
