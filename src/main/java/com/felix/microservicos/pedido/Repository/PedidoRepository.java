package com.felix.microservicos.pedido.Repository;

import com.felix.microservicos.pedido.Model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
