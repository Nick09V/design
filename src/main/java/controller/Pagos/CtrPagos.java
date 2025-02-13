package controller.Pagos;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Pago;
import model.PagoDb;
import view.FrmMenuBar;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class CtrPagos implements ActionListener {

    private FrmMenuBar frmConP;
    private PagoDb pagodb;

    public CtrPagos(FrmMenuBar frmContenedorPrincipal, PagoDb pago) {
        this.frmConP = frmContenedorPrincipal;
        this.pagodb = pago;
        this.frmConP.jMenuIPGuardar.addActionListener(this);
        this.frmConP.jMenuIPBuscar.addActionListener(this);
        this.frmConP.jMenuIPModificar.addActionListener(this);
        this.frmConP.jMenuIPEliminar.addActionListener(this);
        this.frmConP.buttonBuscarP.addActionListener(this);
        this.frmConP.buttonCrearPG.addActionListener(this);
        this.frmConP.buttonBuscarPM.addActionListener(this);
        this.frmConP.buttonModifiarP.addActionListener(this);
        this.frmConP.buttonBuscarPE.addActionListener(this);
        this.frmConP.cmbMetodoPago.addActionListener(this);
        this.frmConP.btnValidar.addActionListener(this); // 🔹 Agregar el listener al botón Validar
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CardLayout cardLayout = (CardLayout) frmConP.PanelPrincipal.getLayout();

        if (e.getSource() == frmConP.jMenuIPGuardar) {
            cardLayout.show(frmConP.PanelPrincipal, "card13");  // PanelGuardar
        }
        if (e.getSource() == frmConP.jMenuIPBuscar) {
            System.out.println("Entro");
            cardLayout.show(frmConP.PanelPrincipal, "card14");  // PanelBuscar
        }
        if (e.getSource() == frmConP.jMenuIPModificar) {
            cardLayout.show(frmConP.PanelPrincipal, "card15");  // PanelModificar
            frmConP.buttonModifiarP.setVisible(false);
        }
        if (e.getSource() == frmConP.jMenuIPEliminar) {
            cardLayout.show(frmConP.PanelPrincipal, "card16");  // PanelEliminar
        }
        if (e.getSource() == frmConP.buttonBuscarP) {
            System.out.println("Entro en el boton");
            pagodb.mostrar(frmConP.tablaP, frmConP.txtBuscarP.getText());
        }
        if (e.getSource() == frmConP.buttonCrearPG) {
            Pago p = new Pago();
            p.setCedula(frmConP.txtCedulaPG.getText());
            p.setMonto(frmConP.txtMontoPG.getText());
            p.setFecha(frmConP.txtFechaPG.getText());
            p.setDesc(frmConP.txtDescripcionPG.getText());
            String tipo = (String) frmConP.comboTipoPG.getSelectedItem();
            p.setTipo(tipo);
            if (pagodb.insertar(p)) {
                JOptionPane.showMessageDialog(frmConP, "Se creo el pago");
            } else {
                JOptionPane.showMessageDialog(frmConP, "No se creo el pago");
            }
            frmConP.txtCedulaPG.setText("");
            frmConP.txtMontoPG.setText("");
            frmConP.txtFechaPG.setText("AAAA-MM-DD");
            frmConP.txtDescripcionPG.setText("");
        }
        if (e.getSource() == frmConP.buttonBuscarPM) {
            Pago p = new Pago();
            if (pagodb.leerP(frmConP.txtIdPM.getText(), p)) {
                frmConP.txtCedulaPM.setText(p.getCedula());
                frmConP.txtMontoPM.setText(p.getMonto());
                frmConP.txtFechaPM.setText(p.getFecha());
                frmConP.txtDescripcionPM.setText(p.getDesc());
                frmConP.buttonModifiarP.setVisible(true);
                frmConP.comboTipoPM.setSelectedItem(p.getTipo());
                frmConP.txtIdPM.setEditable(false);
            } else {
                JOptionPane.showMessageDialog(frmConP, "No se encontro el pago");
            }
        }
        if (e.getSource() == frmConP.buttonModifiarP) {
            Pago p = new Pago();
            p.setCedula(frmConP.txtCedulaPM.getText());
            p.setMonto(frmConP.txtMontoPM.getText());
            p.setFecha(frmConP.txtFechaPM.getText());
            p.setTipo(frmConP.txtCedulaPM.getText());
            p.setDesc(frmConP.txtDescripcionPM.getText());
            String tipo = (String) frmConP.comboTipoPM.getSelectedItem();
            p.setTipo(tipo);
            if (pagodb.actualizar(p, frmConP.txtIdPM.getText())) {
                frmConP.txtCedulaPM.setText("");
                frmConP.txtMontoPM.setText("");
                frmConP.txtFechaPM.setText("");
                frmConP.txtDescripcionPM.setText("");
                JOptionPane.showMessageDialog(frmConP, "Se actualizo el pago");
                frmConP.buttonModifiarP.setVisible(false);
                frmConP.txtIdPM.setEditable(true);
            } else {
                JOptionPane.showMessageDialog(frmConP, "No se actualizo el pago");
            }
        }
        if (e.getSource() == frmConP.buttonBuscarPE) {
            if (pagodb.eliminar(frmConP.txtIdPE.getText())) {
                JOptionPane.showMessageDialog(frmConP, "Se elimino el pago");
            } else {
                JOptionPane.showMessageDialog(frmConP, "No de pudo eliminar el pago");
            }
        }

        if (e.getSource() == frmConP.cmbMetodoPago) {
            int opc = frmConP.cmbMetodoPago.getSelectedIndex();
            switch (opc) {
                case 2:
                    frmConP.PanelPagosEfectivo.setVisible(true);
                    frmConP.PanelPagosTarjeta.setVisible(false);
                    frmConP.txtCodigoTransferencia.setVisible(false);
                    frmConP.lblCodigoTransferencia.setVisible(false);
                    break;
                case 0:
                    frmConP.PanelPagosTarjeta.setVisible(true);
                    frmConP.PanelPagosEfectivo.setVisible(false);
                    frmConP.buttonCrearPG.setEnabled(false);
                    frmConP.txtCodigoTransferencia.setVisible(false);
                    frmConP.lblCodigoTransferencia.setVisible(false);
                    break;
                case 1:
                    frmConP.PanelPagosEfectivo.setVisible(true);
                    frmConP.PanelPagosTarjeta.setVisible(false);
                    frmConP.txtCodigoTransferencia.setVisible(true);
                    frmConP.lblCodigoTransferencia.setVisible(true);
                    break;
                default:
                    System.err.println("No se ha programado todavía");
            }
        }

        if (e.getSource() == frmConP.btnValidar) {
            if(validarTarjeta()){
                frmConP.PanelPagosTarjeta.setVisible(false);
                frmConP.PanelPagosEfectivo.setVisible(true);
                frmConP.buttonCrearPG.setEnabled(true);
            }
        }
    }

    private boolean validarTarjeta() {
        String numeroTarjeta = frmConP.txtNumeroTarjeta.getText().trim();
        String fechaExpiracion = frmConP.txtFechaCaducidad.getText().trim();
        String cvv = frmConP.txtCvv.getText().trim();
        String nombreTitular = frmConP.txtTitularTarjeta.getText().trim();

        if (!validarNumeroTarjeta(numeroTarjeta)) {
            JOptionPane.showMessageDialog(frmConP, "Número de tarjeta inválido.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (!validarFechaExpiracion(fechaExpiracion)) {
            JOptionPane.showMessageDialog(frmConP, "Fecha de expiración inválida o expirada.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (!validarCVV(cvv)) {
            JOptionPane.showMessageDialog(frmConP, "Código CVV inválido.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (nombreTitular.isEmpty()) {
            JOptionPane.showMessageDialog(frmConP, "El nombre del titular no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        JOptionPane.showMessageDialog(frmConP, "Tarjeta válida. Puedes proceder con el pago.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        return true;
    }

    private boolean validarNumeroTarjeta(String numero) {
        if (!numero.matches("\\d{13,19}")) {
            return false;
        }

        int sum = 0;
        boolean alternate = false;

        for (int i = numero.length() - 1; i >= 0; i--) {
            int n = Integer.parseInt(numero.substring(i, i + 1));

            if (alternate) {
                n *= 2;
                if (n > 9) {
                    n -= 9;
                }
            }

            sum += n;
            alternate = !alternate;
        }

        return (sum % 10 == 0);
    }

    private boolean validarFechaExpiracion(String fecha) {
        if (!fecha.matches("\\d{2}/\\d{2}")) {
            return false;
        }

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yy");
            YearMonth fechaExpiracion = YearMonth.parse(fecha, formatter);
            YearMonth ahora = YearMonth.now();

            return !fechaExpiracion.isBefore(ahora);
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    private boolean validarCVV(String cvv) {
        return cvv.matches("\\d{3,4}");
    }
}
