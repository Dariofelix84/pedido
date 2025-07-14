package com.felix.microservicos.pedido.Service;

import com.felix.microservicos.pedido.Model.ItemPedido;
import com.felix.microservicos.pedido.Model.Pedido;
import com.felix.microservicos.pedido.Repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public Pedido salvarPedido(Pedido pedido) {

        if (pedido.getItems() != null) {
            for (ItemPedido item : pedido.getItems()) {
                item.setPedido(pedido);
            }
        }
       return pedidoRepository.save(pedido);
    }

    public List<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }
}
