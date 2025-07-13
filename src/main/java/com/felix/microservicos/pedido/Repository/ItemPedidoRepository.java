package com.felix.microservicos.pedido.Repository;

import com.felix.microservicos.pedido.Model.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> {
}
