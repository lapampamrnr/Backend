package com.techlab.servicios;

import com.techlab.pedidos.LineaPedido;
import com.techlab.pedidos.Pedido;
import com.techlab.productos.Producto;
import com.techlab.excepciones.StockInsuficienteException;

import java.util.ArrayList;

public class PedidoService {

    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public Pedido crearPedido(ArrayList<LineaPedido> lineas) throws StockInsuficienteException {

        for (LineaPedido lp : lineas) {
            if (lp.getCantidad() > lp.getProducto().getStock()) {
                throw new StockInsuficienteException(
                        "No hay stock suficiente para " + lp.getProducto().getNombre());
            }
        }

        Pedido nuevoPedido = new Pedido(lineas);
        pedidos.add(nuevoPedido);

        for (LineaPedido lp : lineas) {
            Producto p = lp.getProducto();
            p.setStock(p.getStock() - lp.getCantidad());
        }

        return nuevoPedido;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
}
