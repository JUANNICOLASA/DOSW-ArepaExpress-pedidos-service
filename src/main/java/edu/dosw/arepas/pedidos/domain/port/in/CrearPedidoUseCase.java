package edu.dosw.arepas.pedidos.domain.port.in;

import edu.dosw.arepas.pedidos.domain.model.CrearPedidoRequest;

public interface CrearPedidoUseCase {
    String crear(CrearPedidoRequest pedido);
}
