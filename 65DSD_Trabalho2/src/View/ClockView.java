package View;

import Controller.ClockController;
import Controller.ClockObserver;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivens
 */
public class ClockView extends javax.swing.JFrame implements ClockObserver{

    private ClockController controller;
    private Date actualDate;
    
    public ClockView() {
        initComponents();
        String adress = JOptionPane.showInputDialog("Digite o endereço do servidor de horas");
        int port = Integer.parseInt(JOptionPane.showInputDialog("Digite a porta do servidor de horas"));
        long sleep = Long.parseLong(JOptionPane.showInputDialog("Digite o tempo de atualização das horas em milissegundos"));
        controller = new ClockController(adress, port, sleep);
        controller.observClock(this);
        actualDate = new Date();
        configureLabelsWithActualDate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblDay = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        lblMonth = new javax.swing.JLabel();
        lblHour = new javax.swing.JLabel();
        lblMins = new javax.swing.JLabel();
        lblSeconds = new javax.swing.JLabel();
        lblMilis = new javax.swing.JLabel();
        lblTimeZone = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Hora");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setText("Minutos");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setText("Segundos");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel4.setText("Milissegundos");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel5.setText("Time Zone");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel6.setText("Ano");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel7.setText("Mês");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel8.setText("Dia");

        lblDay.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblDay.setText(".");

        lblYear.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblYear.setText(".");

        lblMonth.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblMonth.setText(".");

        lblHour.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblHour.setText(".");

        lblMins.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblMins.setText(".");

        lblSeconds.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblSeconds.setText(".");

        lblMilis.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblMilis.setText(".");

        lblTimeZone.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblTimeZone.setText(".");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDay, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYear, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHour, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMins, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSeconds, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMilis, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTimeZone, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYear, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDay, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHour, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMins, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSeconds, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMilis, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTimeZone, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void configureLabelsWithActualDate(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy");
        lblYear.setText(format.format(actualDate));
        
        format = new SimpleDateFormat("MM");
        lblMonth.setText(format.format(actualDate));
        
        format = new SimpleDateFormat("dd");
        lblDay.setText(format.format(actualDate));
        
        format = new SimpleDateFormat("HH");
        lblHour.setText(format.format(actualDate));
        
        format = new SimpleDateFormat("mm");
        lblMins.setText(format.format(actualDate));
        
        format = new SimpleDateFormat("ss");
        lblSeconds.setText(format.format(actualDate));
        
        format = new SimpleDateFormat("SSS");
        lblMilis.setText(format.format(actualDate));
        
        format = new SimpleDateFormat("z");
        lblTimeZone.setText(format.format(actualDate));
        
        format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:SSS z");
        System.out.println(format.format(actualDate));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblDay;
    private javax.swing.JLabel lblHour;
    private javax.swing.JLabel lblMilis;
    private javax.swing.JLabel lblMins;
    private javax.swing.JLabel lblMonth;
    private javax.swing.JLabel lblSeconds;
    private javax.swing.JLabel lblTimeZone;
    private javax.swing.JLabel lblYear;
    // End of variables declaration//GEN-END:variables

    @Override
    public synchronized void attDate(Date newDate) {
        actualDate = newDate;
        configureLabelsWithActualDate();
    }
    
    public void init(){        
        controller.initClock();
    }
}
