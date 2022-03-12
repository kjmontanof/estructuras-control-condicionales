package Controlador;

import Modelo.UnSegundo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import Vista.Formulario;
public class ControladorUnSegundo implements ActionListener {

    Formulario objetoVista;
    UnSegundo objetoModelo;

    public ControladorUnSegundo() {
        objetoVista = new Formulario();
        objetoModelo = new UnSegundo();
        objetoVista.setVisible(true);
        objetoVista.getBoton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == objetoVista.getBoton()) {
            objetoModelo.unSegundo(Integer.parseInt(objetoVista.getTxthoras().getText()),
                    Integer.parseInt(objetoVista.getTxtminutos().getText()),
                    Integer.parseInt(objetoVista.getTxtsegundos().getText()));

            objetoVista.getTxth().setText("" + objetoModelo.getHoras());
            objetoVista.getTxtm().setText("" + objetoModelo.getMinutos());
            objetoVista.getTxts().setText("" + objetoModelo.getSegundos());
        }
    }
}
