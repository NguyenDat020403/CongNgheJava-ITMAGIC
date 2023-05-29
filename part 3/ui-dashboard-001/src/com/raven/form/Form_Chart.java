package com.raven.form;

import Service.impl.TTNhap_Service_impl;
import Services.TTNhapService;
import View_Model.TTNhapViewModel;
import com.raven.chart.ModelChart;
import java.awt.Color;
import java.util.List;

public class Form_Chart extends javax.swing.JPanel {

    List<TTNhapViewModel> ListTTNhap;
    TTNhapService ttSer = new TTNhap_Service_impl();

    public Form_Chart() {
        initComponents();
        addData();
    }

    private void addData() {
        ListTTNhap = ttSer.getALL();
        int January = 0;
        int February = 0;
        int March = 0;
        int April = 0;
        int May = 0;
        int June = 0;
        int July = 0;
        int August = 0;
        int September = 0;
        int October = 0;
        int November = 0;
        int December = 0;

        for (TTNhapViewModel thongTin : ListTTNhap) {

            if (thongTin.getThang() == 1) {
                January = January + 1;
            } else if (thongTin.getThang() == 2) {
                February = February + 1;
            } else if (thongTin.getThang() == 3) {
                March = March + 1;
            } else if (thongTin.getThang() == 4) {
                April = April + 1;
            } else if (thongTin.getThang() == 5) {
                May = May + 1;
            } else if (thongTin.getThang() == 6) {
                June = June + 1;
            } else if (thongTin.getThang() == 7) {
                July = July + 1;
            } else if (thongTin.getThang() == 8) {
                August = August + 1;
            } else if (thongTin.getThang() == 9) {
                September = September + 1;
            } else if (thongTin.getThang() == 10) {
                October = October + 1;
            } else if (thongTin.getThang() == 11) {
                November = November + 1;
            } else if (thongTin.getThang() == 12) {
                December = December + 1;
            }

        }
        chart.addLegend("", new Color(255,255,255));
        chart.addLegend("Số người", new Color(135, 189, 245));
        chart.addLegend("", new Color(255,255,255));
        chart.addData(new ModelChart("January", new double[]{0, January, 0}));
        chart.addData(new ModelChart("February", new double[]{0, February, 0}));
        chart.addData(new ModelChart("March", new double[]{0, March, 0}));
        chart.addData(new ModelChart("April", new double[]{0, April, 0}));
        chart.addData(new ModelChart("May", new double[]{0, May, 0}));
        chart.addData(new ModelChart("June", new double[]{0, June, 0}));
        chart.addData(new ModelChart("July", new double[]{0, July, 0}));
        chart.addData(new ModelChart("August", new double[]{0, August, 0}));
        chart.addData(new ModelChart("September", new double[]{0, September, 0}));
        chart.addData(new ModelChart("October", new double[]{0, October, 0}));
        chart.addData(new ModelChart("November", new double[]{0, November, 0}));
        chart.addData(new ModelChart("December", new double[]{0, December, 0}));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new com.raven.swing.PanelBorder();
        chart = new com.raven.chart.Chart();
        jLabel1 = new javax.swing.JLabel();

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Biểu đồ thể hiện số lượng người tra cứu");

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(jLabel1)
                .addContainerGap(390, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(chart, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.chart.Chart chart;
    private javax.swing.JLabel jLabel1;
    private com.raven.swing.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
