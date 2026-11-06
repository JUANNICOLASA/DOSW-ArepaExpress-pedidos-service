package edu.dosw.arepas.pedidos.domain.port.out;

import edu.dosw.arepas.pedidos.domain.model.PedidoCreadoEvent;

public interface PedidoEventPublisher {
    void publicarPedidoCreado(PedidoCreadoEvent evento);
}
