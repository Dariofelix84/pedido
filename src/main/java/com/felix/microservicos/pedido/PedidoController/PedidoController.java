package com.felix.microservicos.pedido.PedidoController;

import com.felix.microservicos.pedido.Model.Pedido;
import com.felix.microservicos.pedido.Service.PedidoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping
    public String criarPedido(@RequestBody Pedido pedido) {
        pedidoService.salvarPedido(pedido);
        return "Pedido salvo e enviado para processamento." + pedido.getDescricao();
    }

    @GetMapping
    public List<Pedido> listarPedidos() {
        return pedidoService.listarPedidos();
    }
}
