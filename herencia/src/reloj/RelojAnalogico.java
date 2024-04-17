package reloj;


import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class RelojAnalogico extends JPanel {
    private String[] horasTexto = {"en punto", "y cinco", "y diez", "y cuarto", "y veinte", "y veinticinco", "y media", "y treinta", "y treinta y cinco", "menos veinticinco", "menos veinte", "menos cuarto", "menos diez", "menos cinco"};
    private int horas;
    private int minutos;

    public RelojAnalogico() {
        Thread updater = new Thread(() -> {
            while (true) {
                updateHora();
                repaint();
                try {
                    Thread.sleep(1000); // Actualiza cada segundo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        updater.start();
    }

    private void updateHora() {
        Calendar ahora = Calendar.getInstance();
        horas = ahora.get(Calendar.HOUR_OF_DAY);
        minutos = ahora.get(Calendar.MINUTE);
    }

    public String getHora() {
        int hora = horas % 12;
        int min = minutos / 5;
        String horaTexto;
        if (min == 0) {
            horaTexto = "Las " + horaEnTexto(hora) + " " + horasTexto[hora];
        } else if (min < 7) {
            horaTexto = "Las " + horaEnTexto(hora) + " " + horasTexto[min];
        } else if (min == 7 || min == 8) {
            horaTexto = "Las " + horaEnTexto(hora + 1) + " " + horasTexto[min];
        } else {
            horaTexto = "Las " + horaEnTexto((hora + 1) % 12) + " " + horasTexto[14 - min];
        }
        return horaTexto;
    }

    private String horaEnTexto(int hora) {
        switch (hora) {
            case 0:
                return "doce";
            case 1:
                return "una";
            case 2:
                return "dos";
            case 3:
                return "tres";
            case 4:
                return "cuatro";
            case 5:
                return "cinco";
            case 6:
                return "seis";
            case 7:
                return "siete";
            case 8:
                return "ocho";
            case 9:
                return "nueve";
            case 10:
                return "diez";
            case 11:
                return "once";
            default:
                return "";
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Aquí dibujarías el reloj analógico
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Reloj Analógico");
        RelojAnalogico reloj = new RelojAnalogico();
        JLabel horaLabel = new JLabel();

        Timer timer = new Timer(1000, e -> {
            horaLabel.setText(reloj.getHora());
        });
        timer.start();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(new BorderLayout());
        frame.add(reloj, BorderLayout.CENTER);
        frame.add(horaLabel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}

