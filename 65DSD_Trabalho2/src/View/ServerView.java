package View;

import Controller.ServerController;
import Controller.ServerObserver;
import javax.swing.JScrollBar;

/**
 *
 * @author Ivens
 */
public class ServerView extends javax.swing.JFrame implements ServerObserver{

    private ServerController controller;
    
    public ServerView() {
        initComponents();
        controller = new ServerController();
        controller.observServer(this);          
    }       

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txaLog = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txaLog.setColumns(20);
        txaLog.setRows(5);
        jScrollPane1.setViewportView(txaLog);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txaLog;
    // End of variables declaration//GEN-END:variables

    
    public void init(){
        controller.initServer();
    }
    
    @Override
    public void log(String log) {
        txaLog.append(log + "\n");
        JScrollBar vertical = jScrollPane1.getVerticalScrollBar();
        vertical.setValue(vertical.getMaximum());
    }
}
