package Compilador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andrea
 */
public class Interfaz extends javax.swing.JFrame {

    java.util.Stack<String> pilaSintactica = new java.util.Stack<String>();
    java.util.Stack<String> pilaOperadores = new java.util.Stack<String>();

    public Interfaz() {
        initComponents();
        inicializar();
        TablaPila();
    }

    private void inicializar() {
        numerolinea = new NumeroLinea(jTextArea2);
        jScrollPane2.setRowHeaderView(numerolinea);
    }

    NumeroLinea numerolinea;
    int Renglon = 0;
    int Columna = 0;
    int ProducionInice = 0;
    int penultimo = 0;
    String accion;
    int numeroLinea = 1;
    private DefaultTableModel Tabla, TablaVariables, TablaConversion, TablaCodigoIntermedio;
    boolean banDetener = true;

    String tipoDeVariable;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtErrores = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        TextCodigoIntermedio = new javax.swing.JTextArea();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setBackground(new java.awt.Color(213, 237, 249));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setBackground(new java.awt.Color(213, 237, 249));
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/programacion.png"))); // NOI18N
        jButton1.setText("Analizar");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/programacion (1).png"))); // NOI18N
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtErrores.setEditable(false);
        txtErrores.setBackground(new java.awt.Color(213, 237, 249));
        txtErrores.setColumns(20);
        txtErrores.setRows(5);
        jScrollPane5.setViewportView(txtErrores);

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/boton-eliminar.png"))); // NOI18N
        jButton2.setText("Borrar");
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/boton-eliminar (1).png"))); // NOI18N
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Errores");

        jTable2.setBackground(new java.awt.Color(213, 237, 249));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Entrada", "Pila", "Acción"
            }
        ));
        jScrollPane4.setViewportView(jTable2);

        jTabbedPane1.addTab("Pila Sintactica", jScrollPane4);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(jTable3);

        jTabbedPane1.addTab("Pila Operadores", jScrollPane6);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(jTable5);

        jTabbedPane1.addTab("Variables Declaradas", jScrollPane8);

        TextCodigoIntermedio.setColumns(20);
        TextCodigoIntermedio.setRows(5);
        jScrollPane9.setViewportView(TextCodigoIntermedio);

        jTabbedPane1.addTab("Codigo Intermedio", jScrollPane9);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)))
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    String Renglones[] = {"I0", "I1", "I2", "I3", "I4", "I5", "I6", "I7", "I8", "I9", "I10", "I11", "I12", "I13", "I14", "I15", "I16", "I17", "I18", "I19", "I20", "I21", "I22", "I23", "I24", "I25", "I26", "I27", "I28", "I29", "I30", "I31", "I32", "I33", "I34", "I35", "I36", "I37"};
    String Columnas[] = {"id", "num", "int", "float", "char", ",", ";", "+", "-", "*", "/", "(", ")", "=", "$", "P", "Tipo", "V", "A", "S", "E", "T", "F"};
    String matrizSintactica[][] = {
        {"I7", "0", "I4", "I5", "I6", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "I1", "I2", "0", "I3", "0", "0", "0", "0"},
        {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "ACEPTA", "0", "0", "0", "0", "0", "0", "0", "0"},
        {"I8", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
        {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "P2", "0", "0", "0", "0", "0", "0", "0", "0"},
        {"P3", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
        {"P4", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
        {"P5", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
        {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "I9", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
        {"0", "0", "0", "0", "0", "I11", "I12", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "I10", "0", "0", "0", "0", "0"},
        {"I20", "I21", "0", "0", "0", "0", "0", "I14", "I15", "0", "0", "I19", "0", "0", "0", "0", "0", "0", "0", "I13", "I16", "I17", "I18"},
        {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "P1", "0", "0", "0", "0", "0", "0", "0", "0"},
        {"I22", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
        {"I7", "0", "I4", "I5", "I6", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "I23", "I2", "0", "I3", "0", "0", "0", "0"},
        {"0", "0", "0", "0", "0", "0", "I24", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
        {"I20", "I21", "0", "0", "0", "0", "0", "0", "0", "0", "0", "I19", "0", "0", "0", "0", "0", "0", "0", "0", "I25", "I17", "I18"},
        {"I20", "I21", "0", "0", "0", "0", "0", "0", "0", "0", "0", "I19", "0", "0", "0", "0", "0", "0", "0", "0", "I26", "I17", "I18"},
        {"0", "0", "0", "0", "0", "0", "P11", "I27", "I28", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
        {"0", "0", "0", "0", "0", "0", "P14", "P14", "P14", "I29", "I30", "0", "P14", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
        {"0", "0", "0", "0", "0", "0", "P17", "P17", "P17", "P17", "P17", "0", "P17", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
        {"I20", "I21", "0", "0", "0", "0", "0", "0", "0", "0", "0", "I19", "0", "0", "0", "0", "0", "0", "0", "0", "I31", "I17", "I18"},
        {"0", "0", "0", "0", "0", "0", "P19", "P19", "P19", "P19", "P19", "0", "P19", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
        {"0", "0", "0", "0", "0", "0", "P20", "P20", "P20", "P20", "P20", "0", "P20", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
        {"0", "0", "0", "0", "0", "I11", "I12", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "I32", "0", "0", "0", "0", "0"},
        {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "P7", "0", "0", "0", "0", "0", "0", "0", "0"},
        {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "P8", "0", "0", "0", "0", "0", "0", "0", "0"},
        {"0", "0", "0", "0", "0", "0", "P9", "I27", "I28", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
        {"0", "0", "0", "0", "0", "0", "P10", "I27", "I28", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
        {"I20", "I21", "0", "0", "0", "0", "0", "0", "0", "0", "0", "I19", "0", "0", "0", "0", "0", "0", "0", "0", "0", "I33", "I18"},
        {"I20", "I21", "0", "0", "0", "0", "0", "0", "0", "0", "0", "I19", "0", "0", "0", "0", "0", "0", "0", "0", "0", "I34", "I18"},
        {"I20", "I21", "0", "0", "0", "0", "0", "0", "0", "0", "0", "I19", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "I35"},
        {"I20", "I21", "0", "0", "0", "0", "0", "0", "0", "0", "0", "I19", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "I36"},
        {"0", "0", "0", "0", "0", "0", "0", "I27", "I28", "0", "0", "0", "I37", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
        {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "P6", "0", "0", "0", "0", "0", "0", "0", "0"},
        {"0", "0", "0", "0", "0", "0", "P12", "P12", "P12", "I29", "I30", "0", "P12", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
        {"0", "0", "0", "0", "0", "0", "P13", "P13", "P13", "I29", "I30", "0", "P13", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
        {"0", "0", "0", "0", "0", "0", "P15", "P15", "P15", "P15", "P15", "0", "P15", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
        {"0", "0", "0", "0", "0", "0", "P16", "P16", "P16", "P16", "P16", "0", "P16", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
        {"0", "0", "0", "0", "0", "0", "P18", "P18", "P18", "P18", "P18", "0", "P18", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"}};


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        if (!(jTextArea2.getText().isEmpty())) {

            jTextArea1.setText("");
            File fichero = new File("codigo.txt");
            BufferedWriter writer;
            try {
                writer = new BufferedWriter(new FileWriter(fichero));
                writer.write(jTextArea2.getText());
                writer.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo guardar archivo de entrada debido a " + ex.toString());

            }
            try {

                BorrarComponentes();
                TablaPila();
                AnalisisLexico();

                if (banDetener) {

                    AnalisisSemanticoLlenadoMatrizElemtos();

                    AnalisisSemanticoVariables();
                }

            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Tabla.setRowCount(0);
        jTextArea2.setText("");
        BorrarComponentes();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void AnalisisLexico() throws IOException {
        // Abre el archivo "codigo.txt" para lectura
        Reader reader = new BufferedReader(new FileReader("codigo.txt"));

        // Crea un objeto Lexer para analizar el archivo
        Lexer lexer = new Lexer(reader);

        // Bucle infinito para analizar los tokens
        while (true) {
            // Obtiene el siguiente token del Lexer
            Token token = lexer.yylex();

            // Si no hay más tokens, realiza un análisis sintáctico final y sale del bucle
            if (token == null) {
                AnalisisSintactico("$", numeroLinea, lexer.lexeme);
                return;
            }

            // Evalúa el tipo de token y realiza acciones específicas en consecuencia
            switch (token) {
                case salto:
                    // Agrega un salto de línea en jTextArea1 y actualiza el número de línea
                    jTextArea1.setText(jTextArea1.getText() + "\n");
                    numeroLinea = numeroLinea + 1;
                    break;
                case reservada:
                case coma:
                case finSentencia:
                case aritmetico:
                case agrupacion:
                case asignacion:
                    // Agrega el lexema del token seguido de un espacio en jTextArea1
                    // y realiza un análisis sintáctico con el lexema y la línea actual
                    jTextArea1.setText(jTextArea1.getText() + lexer.lexeme + " ");
                    AnalisisSintactico(lexer.lexeme, numeroLinea, lexer.lexeme);
                    break;
                case ERROR:
                    // Agrega un mensaje de error léxico en jTextArea3 indicando la línea y el token no reconocido
                    txtErrores.setText(txtErrores.getText() + "ERROR Lexico linea " + numeroLinea + " token " + lexer.lexeme + " no reconocido \n");
                    break;
                default:
                    // Agrega el valor del token (que no es uno de los casos anteriores) en jTextArea1
                    // y realiza un análisis sintáctico con el valor del token convertido a cadena y la línea actual
                    jTextArea1.setText(jTextArea1.getText() + token + " ");
                    AnalisisSintactico(token + "", numeroLinea, lexer.lexeme);
            }
        }
    }

    public void BorrarComponentes() {
        // Esta función se encarga de borrar o restablecer varios componentes
        // de la interfaz de usuario y variables de control.

        banDetener = true; // Establece la variable 'banDetener' en 'true'.
        numeroLinea = 1;
        LineaAnalisisSemanticoLlenadoMatrizElemtos = 1;// Restablece la variable 'numeroLinea' a 1.
        pilaSintactica.clear();
        pilaOperadores.clear();// Limpia (borra) el contenido de la lista 'pilaSintactica'.
        Renglon = 0;  // Restablece la variable 'Renglon' a 0.
        Columna = 0;  // Restablece la variable 'Columna' a 0.
        penultimo = 0;  // Restablece la variable 'penultimo' a 0.
        jTextArea1.setText("");  // Borra el texto en el componente 'jTextArea1'.
        txtErrores.setText("");  // Borra el texto en el componente 'jTextArea3'.
        tipoDeVariable = "";
        codigo.clear();
    }

    public void TablaPila() {
        // Esta función se utiliza para inicializar una tabla y una pila sintáctica
        // en la interfaz de usuario.

        pilaSintactica.push("$");  // Agrega el símbolo '$' a la pila sintáctica.
        pilaSintactica.push("IO");  // Agrega el símbolo 'IO' a la pila sintáctica.
        Tabla = new DefaultTableModel();  // Crea una nueva instancia de DefaultTableModel.
        Tabla.addColumn("Entrada");  // Agrega una columna llamada "Entrada" a la tabla.
        Tabla.addColumn("Pila");  // Agrega una columna llamada "Pila" a la tabla.
        Tabla.addColumn("Accion");  // Agrega una columna llamada "Accion" a la tabla.
        jTable2.setModel(Tabla);  // Establece el modelo de datos de 'jTable2' con la tabla 'Tabla'.

        TablaVariables = new DefaultTableModel();
        TablaVariables.addColumn("Variable");
        TablaVariables.addColumn("Tipo");
        TablaVariables.addColumn("Valor");
        jTable5.setModel(TablaVariables);

        TablaConversion = new DefaultTableModel();
        TablaConversion.addColumn("Entrada expresion infija");
        TablaConversion.addColumn("Pila Operadores");
        TablaConversion.addColumn("Expresion posfija");
        jTable3.setModel(TablaConversion);

    }

    String NumProduccion[] = {"P0", "P1", "P2", "P3", "P4", "P5", "P6", "P7", "P8", "P9", "P10", "P11", "P12", "P13", "P14", "P15", "P16", "P17", "P18", "P19", "P20"};
    String ProducionDerecha[] = {"P'", "P", "P", "Tipo", "Tipo", "Tipo", "V", "V", "A", "S", "S", "S", "E", "E", "E", "T", "T", "T", "F", "F", "F"};
    String ProducionIzquierda[] = {"ACEPTA", "Tipo id V", "A", "int", "float", "char", ", id V", "; P", "id = S ;", "+ E", "- E", "E", "E + T", "E - T", "T", "T * F", "T / F", "F", "( E )", "id", "num"};
    int NumPops[] = {2, 6, 2, 2, 2, 2, 6, 4, 8, 4, 4, 2, 6, 6, 2, 6, 6, 2, 6, 2, 2};

    public void AnalisisSintactico(String Token, int numLin, String ValorToken) {
        // Método para realizar el análisis sintáctico a partir de un token y número de línea.

        if (banDetener) {
            // Si la variable banDetener es verdadera, continuamos con el análisis.

            penultimo = 0;

            accion = matrizSintactica[Renglon()][Columna(Token)];
            // Obtenemos una acción basada en la matriz sintáctica y la posición actual.

            if (accion.startsWith("I")) {
                // Si la acción comienza con "I" (para desplazar),

                Tabla.addRow(new Object[]{Token, pilaSintactica.toString(), " Desplaza " + Token + " a " + accion});
                // Agregamos una fila a la tabla con información de la acción.

                pilaSintactica.push(Token);
                pilaSintactica.push(accion);
                // Colocamos el token y la acción en la pila sintáctica.

            } else if (accion.startsWith("P")) {
                // Si la acción comienza con "P" (para producir),

                int numIniceProduccion = ColumnaPops(accion);
                // Obtenemos el número de producción a partir de la acción.

                Tabla.addRow(new Object[]{Token, pilaSintactica.toString(), " Produccion " + NumProduccion[numIniceProduccion] + " = " + ProducionDerecha[numIniceProduccion] + "->" + ProducionIzquierda[numIniceProduccion]});
                // Agregamos una fila a la tabla con información de la producción.

                for (int i = 0; i < NumPops[numIniceProduccion]; i++) {
                    pilaSintactica.pop();
                }
                // Realizamos las operaciones "pop" en la pila sintáctica.

                pilaSintactica.push(ProducionDerecha[numIniceProduccion]);
                // Colocamos el lado derecho de la producción en la pila sintáctica.

                accion = matrizSintactica[penultimo()][Columna(pilaSintactica.peek())];
                // Calculamos la próxima acción basada en la pila sintáctica.

                pilaSintactica.push(accion);

                AnalisisSintactico(Token, numLin, ValorToken);
                // Llamamos recursivamente al método para continuar el análisis.

            } else if (accion == "ACEPTA") {
                // Si la acción es "ACEPTA",

                txtErrores.setText(txtErrores.getText() + "Analisis terminado \n");
                // Actualizamos el texto en jTextArea3.

                Tabla.addRow(new Object[]{Token, pilaSintactica.toString(), accion});
                // Agregamos una fila a la tabla con información de la acción.

            } else if (accion == "0") {
                // Si la acción es "0" (indicando un error),

                txtErrores.setText(txtErrores.getText() + "ERROR linea " + numLin + ": Se encontró un token inesperado :" + Token + "\n");
                // Mostramos un mensaje de error en jTextArea3.

                accion = matrizSintactica[Renglon()][Columna(Token)];

                String SeEsperaba = "";
                // Inicializamos una cadena para almacenar lo que se esperaba.

                for (int i = 0; i < 23; i++) {
                    accion = matrizSintactica[CadenaAEntero(pilaSintactica.peek())][i];

                    if (!accion.equals("0")) {
                        // Si la acción no es "0",

                        switch (Columnas[i]) {
                            // Realizamos un switch para determinar qué se esperaba en base a las columnas de la matriz.

                            case "S":
                                SeEsperaba = SeEsperaba + "+ - id num ";
                                break;
                            case "E":
                                SeEsperaba = SeEsperaba + "( id num ";
                                break;
                            case "T":
                                SeEsperaba = SeEsperaba + "( id num ";
                                break;
                            case "F":
                                SeEsperaba = SeEsperaba + "( id num ";
                                break;
                            case "V":
                                SeEsperaba = SeEsperaba + ", ; ";
                                break;
                            case "A":
                                SeEsperaba = SeEsperaba + "id ";
                                break;
                            case "P":
                                SeEsperaba = SeEsperaba + "int float char id ";
                                break;
                            default:
                                SeEsperaba = SeEsperaba + Columnas[i] + " ";
                        }
                    }
                }

                txtErrores.setText(txtErrores.getText() + "ERROR linea " + numLin + ": Se esperaba  ->    " + eliminarElementosRepetidosEnSeEsperaba(SeEsperaba) + "\n");
                // Mostramos un mensaje de error con lo que se esperaba en jTextArea3.

                banDetener = false;
                // Desactivamos la bandera banDetener para detener el análisis.
            }
        }
    }

    /////////////////////////////////////////////////////////////////////////////////////////
    int indiceMatriz = 0;
    ArrayList<String> codigo = new ArrayList<String>();
    int LineaAnalisisSemanticoLlenadoMatrizElemtos = 1;

    public void AnalisisSemanticoLlenadoMatrizElemtos() throws IOException {
        Reader reader = new BufferedReader(new FileReader("codigo.txt"));
        Lexer lexer = new Lexer(reader);

        while (true) {
            Token token = lexer.yylex();
            if (token == null) {
                return;
            }

            switch (token) {
                case salto:
                    LineaAnalisisSemanticoLlenadoMatrizElemtos++;
                    break;
                default:
                    codigo.add(lexer.lexeme + " " + token + " " + LineaAnalisisSemanticoLlenadoMatrizElemtos);

            }

        }

    }

    public void AnalisisSemanticoVariables() {

        ////////////////////////Veo si todas las variables de la asignacion estan declaradas
        HashMap<String, List<Integer>> mapaVariables = new HashMap<>();
        ArrayList<String> entradaExprecion = new ArrayList<String>();

        int tipoDato = 0;
        String cadena;
        String[] elementos;
        String entrada;
        String lexema;
        String linea;
        int contador = 0;

        cadena = codigo.get(contador);
        elementos = cadena.split(" ");

        entrada = elementos[0];

        while (entrada.equals("int") || entrada.equals("float") || entrada.equals("char")) {

            switch (entrada) {
                case "int" ->
                    tipoDato = 0;
                case "float" ->
                    tipoDato = 1;
                case "char" ->
                    tipoDato = 2;
                default -> {
                }
            }

            do {
                cadena = codigo.get(contador);
                elementos = cadena.split(" ");

                entrada = elementos[0];
                lexema = elementos[1];
                linea = elementos[2];

                if (lexema.equals("id")) {

                    // Verificar si una clave existe en el HashMap
                    boolean existeVariable = mapaVariables.containsKey(entrada);
                    if (existeVariable) {

                        txtErrores.setText(txtErrores.getText() + "ERROR semantico: Ya existe la veriable " + entrada + " en la linea: " + linea + "\n");
                        banDetener = false;
                    } else {

                        mapaVariables.computeIfAbsent(entrada, k -> new ArrayList<>()).add(tipoDato);
                        mapaVariables.computeIfAbsent(entrada, k -> new ArrayList<>()).add(null);
                        mapaVariables.computeIfAbsent(entrada, k -> new ArrayList<>()).add(Integer.parseInt(linea));
                        TablaVariables.addRow(new Object[]{entrada, tipoDato, " -- "});

                    }

                }

                contador++;
            } while (!entrada.equals(";"));

            cadena = codigo.get(contador);
            elementos = cadena.split(" ");

            entrada = elementos[0];

        }

        //int contador2;
        // contador2 = contador;
        ////////////////////////Veo si todas las variables de la exprecion estan declaradas
        for (int a = contador; a < codigo.size(); a++) {

            cadena = codigo.get(a);
            elementos = cadena.split(" ");

            entrada = elementos[0];
            lexema = elementos[1];
            linea = elementos[2];

            entradaExprecion.add(entrada);

            if (lexema.equals("id")) {
                boolean existeVariable = mapaVariables.containsKey(entrada);
                if (existeVariable == false) {

                    txtErrores.setText(txtErrores.getText() + "ERROR semantico: No esta declarada la variable  " + entrada + " (error en la linea: " + linea + ")\n");
                    banDetener = false;

                }

            }

        }

        ////////////////////////////////////////////////////////////////////////
        String primerElemetoExpresion;
        primerElemetoExpresion = entradaExprecion.get(0);

        //
        // Eliminar los primeros dos elementos
        entradaExprecion.subList(0, 2).clear();

        ////////////////////////Empiezo con la pila de operadoes
        ArrayList<String> exprecion = new ArrayList<String>();

        //System.out.println(entradaExprecion);
        for (int i = 0; i < entradaExprecion.size(); i++) {

            String elemento = entradaExprecion.get(i);

            switch (elemento) {
                case "(":
                    pilaOperadores.push(elemento);
                    TablaConversion.addRow(new Object[]{elemento, pilaOperadores + "", exprecion + ""});
                    break;

                case ")":

                    while (!pilaOperadores.isEmpty() && !pilaOperadores.peek().equals("(")) {
                        // Puedes almacenar los elementos extraídos en otra estructura si es necesario.
                        // En este caso, simplemente los estamos eliminando.

                        exprecion.add(pilaOperadores.peek());

                        pilaOperadores.pop();
                    }

                    if (!pilaOperadores.isEmpty()) {
                        pilaOperadores.pop();
                    }

                    TablaConversion.addRow(new Object[]{elemento, pilaOperadores + "", exprecion + ""});
                    break;

                case "-":
                case "+":

                    if (pilaOperadores.isEmpty()) {
                        pilaOperadores.push(elemento);
                        TablaConversion.addRow(new Object[]{elemento, pilaOperadores + "", exprecion + ""});

                    } else {

                        switch (pilaOperadores.peek()) {
                            case "-" -> {
                                exprecion.add(pilaOperadores.peek());
                                pilaOperadores.pop();
                                pilaOperadores.push(elemento);

                                TablaConversion.addRow(new Object[]{elemento, pilaOperadores + "", exprecion + ""});
                            }
                            case "+" -> {
                                exprecion.add(pilaOperadores.peek());
                                pilaOperadores.pop();
                                pilaOperadores.push(elemento);
                                TablaConversion.addRow(new Object[]{elemento, pilaOperadores + "", exprecion + ""});
                            }
                            case "/" -> {
                                exprecion.add(pilaOperadores.peek());
                                pilaOperadores.pop();
                                pilaOperadores.push(elemento);
                                TablaConversion.addRow(new Object[]{elemento, pilaOperadores + "", exprecion + ""});
                            }
                            case "*" -> {
                                exprecion.add(pilaOperadores.peek());

                                pilaOperadores.pop();

                                if (!pilaOperadores.isEmpty()) {

                                    do {

                                        exprecion.add(pilaOperadores.peek());
                                        pilaOperadores.pop();
                                        pilaOperadores.push(elemento);
                                        TablaConversion.addRow(new Object[]{elemento, pilaOperadores + "", exprecion + ""});

                                    } while (!(pilaOperadores.peek().equals(elemento)));

                                    break;

                                }

                                pilaOperadores.push(elemento);
                                TablaConversion.addRow(new Object[]{elemento, pilaOperadores + "", exprecion + ""});
                            }
                            default -> {
                                pilaOperadores.push(elemento);
                                TablaConversion.addRow(new Object[]{elemento, pilaOperadores + "", exprecion + ""});
                            }
                        }
                    }
                    break;

                case "/":
                case "*":
                    if (pilaOperadores.isEmpty()) {
                        pilaOperadores.push(elemento);
                        TablaConversion.addRow(new Object[]{elemento, pilaOperadores + "", exprecion + ""});
                    } else {
                        switch (pilaOperadores.peek()) {
                            case "/" -> {
                                exprecion.add(pilaOperadores.peek());
                                pilaOperadores.pop();
                                pilaOperadores.push(elemento);

                                TablaConversion.addRow(new Object[]{elemento, pilaOperadores + "", exprecion + ""});
                            }
                            case "*" -> {
                                exprecion.add(pilaOperadores.peek());
                                pilaOperadores.pop();
                                pilaOperadores.push(elemento);
                                TablaConversion.addRow(new Object[]{elemento, pilaOperadores + "", exprecion + ""});
                            }
                            case "+" -> {
                                pilaOperadores.push(elemento);
                                TablaConversion.addRow(new Object[]{elemento, pilaOperadores + "", exprecion + ""});
                            }
                            case "-" -> {
                                pilaOperadores.push(elemento);
                                TablaConversion.addRow(new Object[]{elemento, pilaOperadores + "", exprecion + ""});
                            }
                            default -> {
                                pilaOperadores.push(elemento);
                                TablaConversion.addRow(new Object[]{elemento, pilaOperadores + "", exprecion + ""});
                            }
                        }
                    }
                    break;

                case ";":
                    while (!pilaOperadores.isEmpty()) {

                        String elementosFinal = pilaOperadores.pop();
                        exprecion.add(elementosFinal);

                    }
                    TablaConversion.addRow(new Object[]{elemento, pilaOperadores + "", exprecion + ""});
                    break;
                default:

                    exprecion.add(elemento);
                    TablaConversion.addRow(new Object[]{elemento, pilaOperadores + "", exprecion + ""});

            }

        }

        if (banDetener) {
            //---AQUI
            ArrayList<String> exprecionTipoDeDato = new ArrayList<String>();

            //System.err.println(exprecion);
            for (int i = 0; i < exprecion.size(); i++) {

                String elementoE = exprecion.get(i);

                //veo si el elemento es entero
                try {
                    int numero = Integer.parseInt(elementoE);
                    elementoE = "int";
                } catch (NumberFormatException e) {
                }

                if (elementoE.contains(".")) {
                    elementoE = "float";
                }

                switch (elementoE) {
                    case "int":
                        exprecionTipoDeDato.add("0");

                        break;
                    case "float":

                        exprecionTipoDeDato.add("1");
                        break;
                    case "*":
                    case "/":
                    case "+":
                    case "-":

                        exprecionTipoDeDato.add(elementoE);
                        break;
                    default:
                        List<Integer> tipoDelElemento = mapaVariables.get(elementoE);

                        Integer tipoD = tipoDelElemento.get(0);
                        exprecionTipoDeDato.add(tipoD + "");

                }

            }

            //System.err.println(exprecionTipoDeDato);
            java.util.Stack<String> pilaTipoDeDato = new java.util.Stack<String>();
            int ValoresVariables[][] = {
                //        int     float    char
                /*int   */{0, 1, -1},
                /*float */ {1, 1, -1},
                /*char  */ {-1, -1, -1}
            };

            for (int i = 0; i < exprecionTipoDeDato.size(); i++) {

                String elementoPilaS = exprecionTipoDeDato.get(i);

                switch (elementoPilaS) {
                    case "0":
                        pilaTipoDeDato.push(elementoPilaS);
                        break;
                    case "1":
                        pilaTipoDeDato.push(elementoPilaS);
                        break;
                    case "2":
                        pilaTipoDeDato.push(elementoPilaS);
                        break;
                    case "-":
                    case "+":
                    case "*":
                    case "/":

                        if (pilaTipoDeDato.size() >= 2) {

                            String elemento1 = pilaTipoDeDato.pop();
                            String elemento2 = pilaTipoDeDato.pop();

                            int entero1 = Integer.parseInt(elemento1);
                            int entero2 = Integer.parseInt(elemento2);

                            int valorEnPosicion = ValoresVariables[entero2][entero1];

                            if (valorEnPosicion == (-1)) {

                                //System.err.println("Incompatible de datos");
                                txtErrores.setText(txtErrores.getText() + "ERROR Sintactico linea " + numeroLinea + ": Tipos de datos no compatibles\n");
                                banDetener = false;
                                break;

                            }

                            pilaTipoDeDato.push(valorEnPosicion + "");

                        }

                        break;
                    default:

                }

            }

            //System.out.println(pilaTipoDeDato);
            int ValoresVariablesIgual[][] = {
                //        int     float    char
                /*int   */{0, 1, -1},
                /*float */ {1, 1, -1},
                /*char  */ {-1, -1, 2}
            };

            if (!pilaTipoDeDato.isEmpty()) {

                List<Integer> tipoDelElemento = mapaVariables.get(primerElemetoExpresion);

                Integer tipoD = tipoDelElemento.get(0);

                String elemento1 = pilaTipoDeDato.pop();

                int entero1 = Integer.parseInt(elemento1);
                int entero2 = Integer.parseInt(tipoD + "");

                int valorEnPosicion = ValoresVariablesIgual[entero2][entero1];
                if (valorEnPosicion == (-1)) {

                    txtErrores.setText(txtErrores.getText() + "ERROR Sintactico linea " + numeroLinea + ": Tipos de datos no compatibles\n");
                    banDetener = false;

                }

            }

        }

        if (banDetener) {
            CodigoIntermedio(exprecion, primerElemetoExpresion);
        }

    }

    ArrayList<Integer> numeroMaxino = new ArrayList<>();

    public void CodigoIntermedio(ArrayList<String> exprecion, String priVariable) {

        java.util.Stack<String> pilaCodIn = new java.util.Stack<String>();
        int IndiceVariablesTemporales = 1;

        System.out.println(exprecion);
        for (int i = 0; i < exprecion.size(); i++) {
            String elemento = exprecion.get(i);

            switch (elemento) {
                case "+":

                case "-":

                case "/":
                case "*":

                    String elemento1 = pilaCodIn.pop();
                    IndiceVariablesTemporales = IndiceVariablesTemporales - 1;
                    String elemento2 = pilaCodIn.pop();
                    IndiceVariablesTemporales = IndiceVariablesTemporales - 1;

                    pilaCodIn.push("V" + IndiceVariablesTemporales);

                    System.out.println(pilaCodIn.peek() + "=" + elemento2 + elemento + elemento1);
                    TextCodigoIntermedio.setText(TextCodigoIntermedio.getText() + pilaCodIn.peek() + "=" + elemento2 + elemento + elemento1 + "\n");

                    IndiceVariablesTemporales = IndiceVariablesTemporales + 1;
                    numeroMaxino.add(IndiceVariablesTemporales);
                    break;

                default:

                    pilaCodIn.push("V" + IndiceVariablesTemporales);

                    System.out.println(pilaCodIn.peek() + "=" + elemento);
                    TextCodigoIntermedio.setText(TextCodigoIntermedio.getText() + pilaCodIn.peek() + "=" + elemento + "\n");
                    IndiceVariablesTemporales++;
                    numeroMaxino.add(IndiceVariablesTemporales);

            }

        }

        System.out.println(priVariable + "=" + pilaCodIn.peek());
        TextCodigoIntermedio.setText(TextCodigoIntermedio.getText() + priVariable + "=" + pilaCodIn.peek() + "\n");

        //System.out.println(obtenerNumeroMasAlto(numeroMaxino));
    }

    public static int obtenerNumeroMasAlto(ArrayList<Integer> lista) {
        // Verificar si la lista está vacía
        if (lista == null || lista.isEmpty()) {
            throw new IllegalArgumentException("La lista no puede estar vacía");
        }

        // Inicializar el número máximo con el primer elemento de la lista
        int maximo = lista.get(0);

        // Iterar sobre la lista para encontrar el número máximo
        for (int i = 1; i < lista.size(); i++) {
            int actual = lista.get(i);

            // Comparar con el número máximo actual
            if (actual > maximo) {
                maximo = actual;
            }
        }

        // Devolver el número máximo
        return maximo;
    }

    public void mas(String operador) {

    }

    public void AddPilaOperadores(String token) {
        switch (token) {
            case "1":

                break;
            case "2":

                break;
            case "3":

                break;
            case "4":

                break;
            default:

        }
    }

    public static String eliminarElementosRepetidosEnSeEsperaba(String input) {
        // Divide la cadena en elementos individuales
        String[] elementos = input.split(" ");

        // Utiliza un conjunto (LinkedHashSet) para eliminar elementos duplicados
        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(elementos));

        // Convierte el conjunto nuevamente a un arreglo
        String[] elementosUnicos = set.toArray(new String[0]);

        // Une los elementos únicos en una cadena separados por espacios
        String resultado = String.join(" ", elementosUnicos);

        return resultado;
    }

    public void noDuplicadosTxtMensaje() {

        // Divide el texto en jTextArea3 en líneas individuales y almacena cada línea en un arreglo de strings.
        String[] lines = txtErrores.getText().split("\n");

        // Crea un conjunto (Set) llamado 'set' que utiliza LinkedHashSet para mantener un conjunto de líneas sin duplicados.
        Set<String> set = new LinkedHashSet<String>(Arrays.asList(lines));

        // Convierte las líneas únicas nuevamente en un solo texto, uniendo los elementos del conjunto con saltos de línea.
        String noDuplicateText = String.join("\n", set);

        // Establece el texto en el componente jTextArea3 para mostrar el texto sin duplicados.
        txtErrores.setText(noDuplicateText);
    }

    public static int CadenaAEntero(String cadena) {
        // Inicializa una cadena vacía 'digitos' para almacenar los dígitos encontrados en la cadena de entrada.
        String digitos = "";

        // Itera a través de cada carácter en la cadena de entrada 'cadena'.
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);

            // Verifica si el carácter es un dígito numérico.
            if (Character.isDigit(caracter)) {
                // Si es un dígito, agrega el carácter a la cadena 'digitos'.
                digitos += caracter;
            }
        }

        // Si no se encontraron dígitos en la cadena, se lanza una excepción.
        if (digitos.isEmpty()) {
            throw new IllegalArgumentException("La cadena no contiene dígitos.");
        }

        // Convierte la cadena 'digitos' en un entero y lo devuelve.
        return Integer.parseInt(digitos);
    }

    // Método que busca la posición de la cima de la pila dentro de Renglones y devuelve su posición
    public int Renglon() {
        for (int i = 0; i < Renglones.length; i++) { // Recorre el arreglo Renglones
            if (Renglones[i].equals(pilaSintactica.peek())) { // Compara el elemento en la posición 'i' de Renglones con el elemento en la cima de la pilaSintactica
                Renglon = i; // Asigna el valor de 'i' a la variable Renglon
                break; // Sale del bucle una vez que se encuentra una coincidencia
            }
        }
        return Renglon; // Devuelve la posición de la cima de la pila en el arreglo Renglones
    }

    public int penultimo() {
        for (int i = 0; i < Renglones.length; i++) { // Recorre el arreglo Renglones
            if (Renglones[i].equals(pilaSintactica.get(pilaSintactica.size() - 2))) { // Compara el elemento en la posición 'i' de Renglones con el penúltimo elemento de la pilaSintactica
                penultimo = i; // Asigna el valor de 'i' a la variable penúltimo
                break; // Sale del bucle una vez que se encuentra una coincidencia
            }
        }
        return penultimo; // Devuelve la posición del penúltimo elemento de la pila en el arreglo Renglones
    }

// Método que busca la posición del token dentro de encabezadosColumnas y devuelve su posición
    public int Columna(String token) {
        for (int i = 0; i < Columnas.length; i++) { // Recorre el arreglo Columnas
            if (token.equals(Columnas[i])) { // Compara el token con el elemento en la posición 'i' de Columnas
                Columna = i; // Asigna el valor de 'i' a la variable Columna
                break; // Sale del bucle una vez que se encuentra una coincidencia
            }
        }
        return Columna; // Devuelve la posición del token en el arreglo Columnas
    }

// Método que busca la posición del token dentro de NumProduccion y devuelve su posición
    public int ColumnaPops(String accionProduccion) {
        for (int i = 0; i < NumProduccion.length; i++) { // Recorre el arreglo NumProduccion
            if (accionProduccion.equals(NumProduccion[i])) { // Compara accionProduccion con el elemento en la posición 'i' de NumProduccion
                ProducionInice = i; // Asigna el valor de 'i' a la variable ProducionInice
                break; // Sale del bucle una vez que se encuentra una coincidencia
            }
        }
        return ProducionInice; // Devuelve la posición del token en el arreglo NumProduccion
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TextCodigoIntermedio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea txtErrores;
    // End of variables declaration//GEN-END:variables
}
