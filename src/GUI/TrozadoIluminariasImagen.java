/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.Manteciones;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.SwingWorker;

/**
 *
 * @author ferna
 */
public class TrozadoIluminariasImagen extends javax.swing.JPanel {

	private BLL.Usuarios user;
	private javax.swing.JPanel jp;
	private ArrayList<JButton> jb;
	private JDialog modalDialog;


	private class WorkerCorreoAv extends SwingWorker<Void, Void> {

		@Override
		protected Void doInBackground() throws Exception {
			new BLL.Correos().envioCorreosAviso(equipos);
			return null;
		}

		@Override
		protected void done() {
			try {
				get();

			} catch (InterruptedException | ExecutionException ex) {
				Logger.getLogger(MantencionesGUI.class.getName()).log(Level.SEVERE, null, ex);
			}
			JOptionPane.showMessageDialog(null, "Su mensaje ha sido enviado");

			modalDialog.setVisible(false);
			modalDialog.dispose();
		}
	}
	private String equipos;

	/**
	 * Creates new form prueba
	 */
	public TrozadoIluminariasImagen(javax.swing.JPanel jp) {

		initComponents();
		this.jp = jp;
		this.user = Main.Main.user;
		this.colorBotones(new Manteciones().listC());

		this.jBPrueba1.setEnabled(false);
		this.jBPrueba1.setVisible(false);
	}

	public TrozadoIluminariasImagen() {
		initComponents();
	}

	private void initButton(JButton jb) {
		jb.setBorder(new LineBorder(this.colorear(jb.getName())));
	}

	public Color colorear(String equipo) {
		return new Manteciones(equipo).colorear();
	}

	public void colorBotones(ArrayList s) {
		this.jb = this.listaBotones();
		ArrayList<String> ss = s;

		for (JButton x : this.jb) {
			x.setBorder(new LineBorder(Color.GREEN));
			for (String d : ss) {

				try {

					if (x.getName().equalsIgnoreCase(d)) {
						x.setBorder(new LineBorder(Color.RED));

						break;
					}
				} catch (Exception ex) {

				}

			}
			this.updateUI();
			this.repaint();
		}

	}

	public void aviso(ArrayList s) {
		ArrayList<String> ss = s;
		Date date = new Date();
		this.equipos = "equipos: ";
		for (String d : ss) {
			for (JButton x : this.jb) {
				try {

					if (x.getName().equalsIgnoreCase(d)) {
						x.setBorder(new LineBorder(Color.RED));
						new Manteciones().Manteciones(
								d,
								"Equipo sin revisión por mucho tiempo",
								date,
								"bkb",
								"Sitema",
								"5056",
								"sistema@sistema.com ");
						equipos = equipos + "\n" + d;
						break;
					}
				} catch (Exception ex) {

				}

			}

		}

		this.updateUI();
		this.repaint();
		modalDialog = new VentanaLoading(null, false);
		modalDialog.pack();
		modalDialog.setSize(200, 150);
		modalDialog.setLocationRelativeTo(null);

		modalDialog.setVisible(true);

		WorkerCorreoAv w = new WorkerCorreoAv();
		w.execute();

	}

	public ArrayList listaBotones() {
		ArrayList<JButton> jb = new ArrayList();
		jb.add(q1);
		jb.add(q2);
		jb.add(q3);
		jb.add(q4);
		jb.add(q5);

		jb.add(q6);
		jb.add(q7);
		jb.add(q8);
		jb.add(q9);
		jb.add(q10);

		jb.add(q11);
		jb.add(q12);
		jb.add(q13);
		jb.add(q14);
		jb.add(q15);

		jb.add(q16);
		jb.add(q17);
		jb.add(q18);
		jb.add(q19);
		jb.add(q20);

		jb.add(q21);
		jb.add(q22);

		jb.add(q24);

		jb.add(q26);
		jb.add(q27);
		jb.add(q28);
		jb.add(q29);
		jb.add(q30);

		jb.add(q31);
		jb.add(q32);
		jb.add(q33);
		jb.add(q34);
		jb.add(q35);

		jb.add(q36);
		jb.add(q37);
		jb.add(q38);
		jb.add(q39);
		jb.add(q40);

		jb.add(q41);
		jb.add(q42);
		jb.add(q43);
		jb.add(q44);
		jb.add(q45);

		jb.add(q46);
		jb.add(q47);
		jb.add(q48);
		jb.add(q49);
		jb.add(q50);

		jb.add(q51);
		jb.add(q52);
		jb.add(q53);
		jb.add(q54);
		jb.add(q55);

		jb.add(q56);
		jb.add(q57);
		jb.add(q58);
		jb.add(q59);
		jb.add(q60);

		jb.add(q61);
		jb.add(q62);
		jb.add(q63);
		jb.add(q64);
		jb.add(q65);

		jb.add(q66);
		jb.add(q67);
		jb.add(q68);

		jb.add(q70);

		jb.add(q71);
		jb.add(q72);

		jb.add(q74);
		jb.add(q75);

		jb.add(q76);
		jb.add(q77);
		jb.add(q78);
		jb.add(q79);
		jb.add(q80);

		jb.add(q81);
		jb.add(q82);
		jb.add(q83);
		jb.add(q84);
		jb.add(q85);

		jb.add(q86);

		jb.add(q90);

		jb.add(q91);
		jb.add(q92);
		jb.add(q93);
		jb.add(q94);
		jb.add(q95);

		jb.add(q98);
		jb.add(q99);

		jb.add(q101);
		jb.add(q102);
		jb.add(q103);
		jb.add(q104);
		jb.add(q105);

		jb.add(q106);
		jb.add(q107);
		jb.add(q108);
		jb.add(q109);
		jb.add(q110);

		jb.add(q111);
		jb.add(q112);
		jb.add(q113);
		jb.add(q114);
		jb.add(q115);

		jb.add(q116);
		jb.add(q117);
		jb.add(q118);
		jb.add(q119);
		jb.add(q120);

		jb.add(q121);
		jb.add(q122);
		jb.add(q123);
		jb.add(q124);
		jb.add(q125);

		jb.add(q126);
		jb.add(q127);
		jb.add(q128);
		jb.add(q129);
		jb.add(q130);

		jb.add(q131);
		jb.add(q132);
		jb.add(q133);
		jb.add(q134);
		jb.add(q135);

		jb.add(q136);
		jb.add(q137);
		jb.add(q138);
		jb.add(q139);
		jb.add(q140);

		jb.add(q141);
		jb.add(q142);
		jb.add(q143);
		jb.add(q144);
		jb.add(q145);

		jb.add(q146);
		jb.add(q147);

		return jb;
	}

	public void botones() {
		this.initButton(this.q1);
		this.initButton(this.q2);
		this.initButton(this.q3);
		this.initButton(this.q4);
		this.initButton(this.q5);
		this.initButton(this.q6);
		this.initButton(this.q7);
		this.initButton(this.q8);
		this.initButton(this.q9);
		this.initButton(this.q10);
		this.initButton(this.q11);
		this.initButton(this.q12);
		this.initButton(this.q13);
		this.initButton(this.q14);
		this.initButton(this.q15);
		this.initButton(this.q16);
		this.initButton(this.q17);
		this.initButton(this.q18);
		this.initButton(this.q19);
		this.initButton(this.q20);

		this.initButton(this.q21);
		this.initButton(this.q22);
		this.initButton(this.q24);
		this.initButton(this.q26);
		this.initButton(this.q27);
		this.initButton(this.q28);
		this.initButton(this.q29);
		this.initButton(this.q30);
		this.initButton(this.q31);
		this.initButton(this.q32);
		this.initButton(this.q33);

		this.initButton(this.q34);
		this.initButton(this.q35);
		this.initButton(this.q36);
		this.initButton(this.q37);
		this.initButton(this.q38);
		this.initButton(this.q39);
		this.initButton(this.q40);
		this.initButton(this.q41);
		this.initButton(this.q42);
		this.initButton(this.q43);
		this.initButton(this.q44);

		this.initButton(this.q45);
		this.initButton(this.q46);
		this.initButton(this.q47);
		this.initButton(this.q48);
		this.initButton(this.q49);
		this.initButton(this.q50);
		this.initButton(this.q51);
		this.initButton(this.q52);
		this.initButton(this.q53);
		this.initButton(this.q54);
		this.initButton(this.q55);
		this.initButton(this.q56);
		this.initButton(this.q57);
		this.initButton(this.q58);
		this.initButton(this.q59);
		this.initButton(this.q60);
		this.initButton(this.q61);
		this.initButton(this.q62);
		this.initButton(this.q63);
		this.initButton(this.q64);
		this.initButton(this.q65);
		this.initButton(this.q66);
		this.initButton(this.q67);
		this.initButton(this.q68);
		this.initButton(this.q70);
		this.initButton(this.q71);
		this.initButton(this.q72);
		this.initButton(this.q74);
		this.initButton(this.q75);
		this.initButton(this.q76);
		this.initButton(this.q77);
		this.initButton(this.q78);
		this.initButton(this.q79);
		this.initButton(this.q80);
		this.initButton(this.q81);
		this.initButton(this.q82);
		this.initButton(this.q83);
		this.initButton(this.q84);
		this.initButton(this.q85);
		this.initButton(this.q86);
		this.initButton(this.q90);
		this.initButton(this.q91);
		this.initButton(this.q92);
		this.initButton(this.q93);
		this.initButton(this.q94);
		this.initButton(this.q95);
		this.initButton(this.q98);
		this.initButton(this.q99);
		this.initButton(this.q101);
		this.initButton(this.q102);
		this.initButton(this.q103);
		this.initButton(this.q104);
		this.initButton(this.q105);
		this.initButton(this.q106);
		this.initButton(this.q107);
		this.initButton(this.q108);
		this.initButton(this.q109);
		this.initButton(this.q110);
		this.initButton(this.q111);
		this.initButton(this.q112);
		this.initButton(this.q113);
		this.initButton(this.q114);
		this.initButton(this.q115);
		this.initButton(this.q116);
		this.initButton(this.q117);
		this.initButton(this.q118);
		this.initButton(this.q119);
		this.initButton(this.q120);
		this.initButton(this.q121);
		this.initButton(this.q122);
		this.initButton(this.q123);
		this.initButton(this.q124);
		this.initButton(this.q125);
		this.initButton(this.q126);
		this.initButton(this.q127);
		this.initButton(this.q128);
		this.initButton(this.q129);
		this.initButton(this.q130);
		this.initButton(this.q131);
		this.initButton(this.q132);
		this.initButton(this.q133);
		this.initButton(this.q134);
		this.initButton(this.q135);
		this.initButton(this.q136);
		this.initButton(this.q137);
		this.initButton(this.q138);
		this.initButton(this.q139);
		this.initButton(this.q140);
		this.initButton(this.q141);
		this.initButton(this.q144);
		this.initButton(this.q145);
		this.initButton(this.q146);
		this.initButton(this.q147);
		this.initButton(this.q142);
		this.initButton(this.q143);

	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        aa1 = new javax.swing.JPanel();
        q123 = new javax.swing.JButton();
        q122 = new javax.swing.JButton();
        q125 = new javax.swing.JButton();
        q124 = new javax.swing.JButton();
        q143 = new javax.swing.JButton();
        q142 = new javax.swing.JButton();
        q141 = new javax.swing.JButton();
        q140 = new javax.swing.JButton();
        q139 = new javax.swing.JButton();
        q126 = new javax.swing.JButton();
        q127 = new javax.swing.JButton();
        q128 = new javax.swing.JButton();
        q129 = new javax.swing.JButton();
        q130 = new javax.swing.JButton();
        q131 = new javax.swing.JButton();
        q132 = new javax.swing.JButton();
        q133 = new javax.swing.JButton();
        q134 = new javax.swing.JButton();
        q135 = new javax.swing.JButton();
        q136 = new javax.swing.JButton();
        q137 = new javax.swing.JButton();
        q138 = new javax.swing.JButton();
        q121 = new javax.swing.JButton();
        q90 = new javax.swing.JButton();
        q101 = new javax.swing.JButton();
        q102 = new javax.swing.JButton();
        q120 = new javax.swing.JButton();
        q119 = new javax.swing.JButton();
        q118 = new javax.swing.JButton();
        q117 = new javax.swing.JButton();
        q116 = new javax.swing.JButton();
        q115 = new javax.swing.JButton();
        q114 = new javax.swing.JButton();
        q113 = new javax.swing.JButton();
        q112 = new javax.swing.JButton();
        q111 = new javax.swing.JButton();
        q110 = new javax.swing.JButton();
        q109 = new javax.swing.JButton();
        q108 = new javax.swing.JButton();
        q107 = new javax.swing.JButton();
        q106 = new javax.swing.JButton();
        q105 = new javax.swing.JButton();
        q104 = new javax.swing.JButton();
        q103 = new javax.swing.JButton();
        q99 = new javax.swing.JButton();
        q98 = new javax.swing.JButton();
        q95 = new javax.swing.JButton();
        q94 = new javax.swing.JButton();
        q93 = new javax.swing.JButton();
        q92 = new javax.swing.JButton();
        q86 = new javax.swing.JButton();
        q85 = new javax.swing.JButton();
        q84 = new javax.swing.JButton();
        q83 = new javax.swing.JButton();
        q82 = new javax.swing.JButton();
        q81 = new javax.swing.JButton();
        q79 = new javax.swing.JButton();
        q78 = new javax.swing.JButton();
        q77 = new javax.swing.JButton();
        q76 = new javax.swing.JButton();
        q75 = new javax.swing.JButton();
        q74 = new javax.swing.JButton();
        q72 = new javax.swing.JButton();
        q71 = new javax.swing.JButton();
        q68 = new javax.swing.JButton();
        q67 = new javax.swing.JButton();
        q66 = new javax.swing.JButton();
        q65 = new javax.swing.JButton();
        q64 = new javax.swing.JButton();
        q63 = new javax.swing.JButton();
        q62 = new javax.swing.JButton();
        q61 = new javax.swing.JButton();
        q58 = new javax.swing.JButton();
        q57 = new javax.swing.JButton();
        q56 = new javax.swing.JButton();
        q55 = new javax.swing.JButton();
        q54 = new javax.swing.JButton();
        q53 = new javax.swing.JButton();
        q52 = new javax.swing.JButton();
        q51 = new javax.swing.JButton();
        q49 = new javax.swing.JButton();
        q48 = new javax.swing.JButton();
        q47 = new javax.swing.JButton();
        q46 = new javax.swing.JButton();
        q45 = new javax.swing.JButton();
        q44 = new javax.swing.JButton();
        q43 = new javax.swing.JButton();
        q42 = new javax.swing.JButton();
        q41 = new javax.swing.JButton();
        q39 = new javax.swing.JButton();
        q38 = new javax.swing.JButton();
        q37 = new javax.swing.JButton();
        q36 = new javax.swing.JButton();
        q35 = new javax.swing.JButton();
        q34 = new javax.swing.JButton();
        q33 = new javax.swing.JButton();
        q32 = new javax.swing.JButton();
        q31 = new javax.swing.JButton();
        q30 = new javax.swing.JButton();
        q24 = new javax.swing.JButton();
        q29 = new javax.swing.JButton();
        q28 = new javax.swing.JButton();
        q27 = new javax.swing.JButton();
        q26 = new javax.swing.JButton();
        q22 = new javax.swing.JButton();
        q21 = new javax.swing.JButton();
        q19 = new javax.swing.JButton();
        q18 = new javax.swing.JButton();
        q17 = new javax.swing.JButton();
        q16 = new javax.swing.JButton();
        q15 = new javax.swing.JButton();
        q14 = new javax.swing.JButton();
        q13 = new javax.swing.JButton();
        q12 = new javax.swing.JButton();
        q11 = new javax.swing.JButton();
        q9 = new javax.swing.JButton();
        q8 = new javax.swing.JButton();
        q7 = new javax.swing.JButton();
        q6 = new javax.swing.JButton();
        q5 = new javax.swing.JButton();
        q4 = new javax.swing.JButton();
        q3 = new javax.swing.JButton();
        q2 = new javax.swing.JButton();
        q1 = new javax.swing.JButton();
        q10 = new javax.swing.JButton();
        q20 = new javax.swing.JButton();
        q40 = new javax.swing.JButton();
        q50 = new javax.swing.JButton();
        q59 = new javax.swing.JButton();
        q60 = new javax.swing.JButton();
        q70 = new javax.swing.JButton();
        q80 = new javax.swing.JButton();
        q144 = new javax.swing.JButton();
        q145 = new javax.swing.JButton();
        q147 = new javax.swing.JButton();
        q146 = new javax.swing.JButton();
        q91 = new javax.swing.JButton();
        jBPrueba = new javax.swing.JButton();
        jBPrueba1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        aa1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        q123.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q123.setForeground(new java.awt.Color(240, 240, 240));
        q123.setText("q123");
        q123.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q123.setContentAreaFilled(false);
        q123.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q123.setName("Q123"); // NOI18N
        q123.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q123ActionPerformed(evt);
            }
        });
        aa1.add(q123, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 100, 40));
        q123.getAccessibleContext().setAccessibleName("Q123");

        q122.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q122.setForeground(new java.awt.Color(240, 240, 240));
        q122.setText("q123");
        q122.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q122.setContentAreaFilled(false);
        q122.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q122.setName("Q122"); // NOI18N
        q122.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q122ActionPerformed(evt);
            }
        });
        aa1.add(q122, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 100, 40));

        q125.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q125.setForeground(new java.awt.Color(240, 240, 240));
        q125.setText("q123");
        q125.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q125.setContentAreaFilled(false);
        q125.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q125.setName("Q125"); // NOI18N
        q125.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q125ActionPerformed(evt);
            }
        });
        aa1.add(q125, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 100, 40));

        q124.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q124.setForeground(new java.awt.Color(240, 240, 240));
        q124.setText("q123");
        q124.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q124.setContentAreaFilled(false);
        q124.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q124.setName("Q124"); // NOI18N
        q124.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q124ActionPerformed(evt);
            }
        });
        aa1.add(q124, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 100, 40));

        q143.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q143.setForeground(new java.awt.Color(240, 240, 240));
        q143.setToolTipText("");
        q143.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q143.setContentAreaFilled(false);
        q143.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q143.setName("Q143"); // NOI18N
        q143.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q143ActionPerformed(evt);
            }
        });
        aa1.add(q143, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 1330, 50, 50));

        q142.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q142.setForeground(new java.awt.Color(240, 240, 240));
        q142.setToolTipText("");
        q142.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q142.setContentAreaFilled(false);
        q142.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q142.setName("Q142"); // NOI18N
        q142.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q142ActionPerformed(evt);
            }
        });
        aa1.add(q142, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 1140, 30, 30));

        q141.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q141.setForeground(new java.awt.Color(240, 240, 240));
        q141.setText("q123");
        q141.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q141.setContentAreaFilled(false);
        q141.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q141.setName("Q141"); // NOI18N
        q141.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q141ActionPerformed(evt);
            }
        });
        aa1.add(q141, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 20, 20));

        q140.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q140.setForeground(new java.awt.Color(240, 240, 240));
        q140.setText("q123");
        q140.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q140.setContentAreaFilled(false);
        q140.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q140.setName("Q140"); // NOI18N
        q140.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q140ActionPerformed(evt);
            }
        });
        aa1.add(q140, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 20, 20));

        q139.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q139.setForeground(new java.awt.Color(240, 240, 240));
        q139.setText("q123");
        q139.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q139.setContentAreaFilled(false);
        q139.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q139.setName("Q139"); // NOI18N
        q139.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q139ActionPerformed(evt);
            }
        });
        aa1.add(q139, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 20, 20));
        q139.getAccessibleContext().setAccessibleName("Q139");

        q126.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q126.setForeground(new java.awt.Color(240, 240, 240));
        q126.setText("q123");
        q126.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q126.setContentAreaFilled(false);
        q126.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q126.setName("Q126"); // NOI18N
        q126.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q126ActionPerformed(evt);
            }
        });
        aa1.add(q126, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 60, 40));

        q127.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q127.setForeground(new java.awt.Color(240, 240, 240));
        q127.setText("q123");
        q127.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q127.setContentAreaFilled(false);
        q127.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q127.setName("Q127"); // NOI18N
        q127.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q127ActionPerformed(evt);
            }
        });
        aa1.add(q127, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 100, 40));

        q128.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q128.setForeground(new java.awt.Color(240, 240, 240));
        q128.setText("q123");
        q128.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q128.setContentAreaFilled(false);
        q128.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q128.setName("Q128"); // NOI18N
        q128.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q128ActionPerformed(evt);
            }
        });
        aa1.add(q128, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 100, 40));

        q129.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q129.setForeground(new java.awt.Color(240, 240, 240));
        q129.setText("q123");
        q129.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q129.setContentAreaFilled(false);
        q129.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q129.setName("Q129"); // NOI18N
        q129.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q129ActionPerformed(evt);
            }
        });
        aa1.add(q129, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 100, 30));

        q130.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q130.setForeground(new java.awt.Color(240, 240, 240));
        q130.setText("q123");
        q130.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q130.setContentAreaFilled(false);
        q130.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q130.setName("Q130"); // NOI18N
        q130.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q130ActionPerformed(evt);
            }
        });
        aa1.add(q130, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 100, 40));

        q131.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q131.setForeground(new java.awt.Color(240, 240, 240));
        q131.setText("q123");
        q131.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q131.setContentAreaFilled(false);
        q131.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q131.setName("Q131"); // NOI18N
        q131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q131ActionPerformed(evt);
            }
        });
        aa1.add(q131, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 100, 40));

        q132.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q132.setForeground(new java.awt.Color(240, 240, 240));
        q132.setText("q123");
        q132.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q132.setContentAreaFilled(false);
        q132.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q132.setName("Q132"); // NOI18N
        q132.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q132ActionPerformed(evt);
            }
        });
        aa1.add(q132, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 100, 40));

        q133.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q133.setForeground(new java.awt.Color(240, 240, 240));
        q133.setText("q123");
        q133.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q133.setContentAreaFilled(false);
        q133.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q133.setName("Q133"); // NOI18N
        q133.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q133ActionPerformed(evt);
            }
        });
        aa1.add(q133, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, 100, 40));

        q134.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q134.setForeground(new java.awt.Color(240, 240, 240));
        q134.setText("q123");
        q134.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q134.setContentAreaFilled(false);
        q134.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q134.setName("Q134"); // NOI18N
        q134.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q134ActionPerformed(evt);
            }
        });
        aa1.add(q134, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, 100, 40));

        q135.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q135.setForeground(new java.awt.Color(240, 240, 240));
        q135.setText("q123");
        q135.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q135.setContentAreaFilled(false);
        q135.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q135.setName("Q135"); // NOI18N
        q135.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q135ActionPerformed(evt);
            }
        });
        aa1.add(q135, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 100, 40));

        q136.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q136.setForeground(new java.awt.Color(240, 240, 240));
        q136.setText("q123");
        q136.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q136.setContentAreaFilled(false);
        q136.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q136.setName("Q136"); // NOI18N
        q136.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q136ActionPerformed(evt);
            }
        });
        aa1.add(q136, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 310, 100, 40));

        q137.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q137.setForeground(new java.awt.Color(240, 240, 240));
        q137.setText("q123");
        q137.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q137.setContentAreaFilled(false);
        q137.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q137.setName("Q137"); // NOI18N
        q137.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q137ActionPerformed(evt);
            }
        });
        aa1.add(q137, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 250, 100, 40));

        q138.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q138.setForeground(new java.awt.Color(240, 240, 240));
        q138.setText("q123");
        q138.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q138.setContentAreaFilled(false);
        q138.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q138.setName("Q138"); // NOI18N
        q138.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q138ActionPerformed(evt);
            }
        });
        aa1.add(q138, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 200, 100, 40));

        q121.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q121.setForeground(new java.awt.Color(240, 240, 240));
        q121.setText("q123");
        q121.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q121.setContentAreaFilled(false);
        q121.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q121.setName("Q121"); // NOI18N
        q121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q121ActionPerformed(evt);
            }
        });
        aa1.add(q121, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 100, 40));

        q90.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q90.setForeground(new java.awt.Color(240, 240, 240));
        q90.setText("q123");
        q90.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q90.setContentAreaFilled(false);
        q90.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q90.setName("Q90"); // NOI18N
        q90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q90ActionPerformed(evt);
            }
        });
        aa1.add(q90, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 700, 70, 60));

        q101.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q101.setForeground(new java.awt.Color(240, 240, 240));
        q101.setText("q123");
        q101.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q101.setContentAreaFilled(false);
        q101.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q101.setName("Q101"); // NOI18N
        q101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q101ActionPerformed(evt);
            }
        });
        aa1.add(q101, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 580, 70, 60));

        q102.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q102.setForeground(new java.awt.Color(240, 240, 240));
        q102.setText("q123");
        q102.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q102.setContentAreaFilled(false);
        q102.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q102.setName("Q102"); // NOI18N
        q102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q102ActionPerformed(evt);
            }
        });
        aa1.add(q102, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 560, 70, 80));

        q120.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q120.setForeground(new java.awt.Color(240, 240, 240));
        q120.setText("q123");
        q120.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q120.setContentAreaFilled(false);
        q120.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q120.setName("Q120"); // NOI18N
        q120.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q120ActionPerformed(evt);
            }
        });
        aa1.add(q120, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 350, 60, 70));

        q119.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q119.setForeground(new java.awt.Color(240, 240, 240));
        q119.setText("q123");
        q119.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q119.setContentAreaFilled(false);
        q119.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q119.setName("Q119"); // NOI18N
        q119.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q119ActionPerformed(evt);
            }
        });
        aa1.add(q119, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 360, 70, 60));

        q118.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q118.setForeground(new java.awt.Color(240, 240, 240));
        q118.setText("q123");
        q118.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q118.setContentAreaFilled(false);
        q118.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q118.setName("Q118"); // NOI18N
        q118.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q118ActionPerformed(evt);
            }
        });
        aa1.add(q118, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, 70, 60));

        q117.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q117.setForeground(new java.awt.Color(240, 240, 240));
        q117.setText("q123");
        q117.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q117.setContentAreaFilled(false);
        q117.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q117.setName("Q117"); // NOI18N
        q117.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q117ActionPerformed(evt);
            }
        });
        aa1.add(q117, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 70, 60));

        q116.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q116.setForeground(new java.awt.Color(240, 240, 240));
        q116.setText("q123");
        q116.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q116.setContentAreaFilled(false);
        q116.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q116.setName("Q116"); // NOI18N
        q116.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q116ActionPerformed(evt);
            }
        });
        aa1.add(q116, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 80, 60));

        q115.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q115.setForeground(new java.awt.Color(240, 240, 240));
        q115.setText("q123");
        q115.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q115.setContentAreaFilled(false);
        q115.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q115.setName("Q115"); // NOI18N
        q115.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q115ActionPerformed(evt);
            }
        });
        aa1.add(q115, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 80, 60));

        q114.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q114.setForeground(new java.awt.Color(240, 240, 240));
        q114.setText("q123");
        q114.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q114.setContentAreaFilled(false);
        q114.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q114.setName("Q114"); // NOI18N
        q114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q114ActionPerformed(evt);
            }
        });
        aa1.add(q114, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 80, 60));

        q113.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q113.setForeground(new java.awt.Color(240, 240, 240));
        q113.setText("q123");
        q113.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q113.setContentAreaFilled(false);
        q113.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q113.setName("Q113"); // NOI18N
        q113.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q113ActionPerformed(evt);
            }
        });
        aa1.add(q113, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 80, 60));

        q112.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q112.setForeground(new java.awt.Color(240, 240, 240));
        q112.setText("q123");
        q112.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q112.setContentAreaFilled(false);
        q112.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q112.setName("Q112"); // NOI18N
        q112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q112ActionPerformed(evt);
            }
        });
        aa1.add(q112, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 70, 60));

        q111.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q111.setForeground(new java.awt.Color(240, 240, 240));
        q111.setText("q123");
        q111.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q111.setContentAreaFilled(false);
        q111.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q111.setName("Q111"); // NOI18N
        q111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q111ActionPerformed(evt);
            }
        });
        aa1.add(q111, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 460, 60, 70));

        q110.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q110.setForeground(new java.awt.Color(240, 240, 240));
        q110.setText("q123");
        q110.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q110.setContentAreaFilled(false);
        q110.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q110.setName("Q110"); // NOI18N
        q110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q110ActionPerformed(evt);
            }
        });
        aa1.add(q110, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 470, 70, 60));

        q109.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q109.setForeground(new java.awt.Color(240, 240, 240));
        q109.setText("q123");
        q109.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q109.setContentAreaFilled(false);
        q109.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q109.setName("Q109"); // NOI18N
        q109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q109ActionPerformed(evt);
            }
        });
        aa1.add(q109, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 470, 70, 60));

        q108.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q108.setForeground(new java.awt.Color(240, 240, 240));
        q108.setText("q123");
        q108.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q108.setContentAreaFilled(false);
        q108.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q108.setName("Q108"); // NOI18N
        q108.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q108ActionPerformed(evt);
            }
        });
        aa1.add(q108, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 470, 70, 60));

        q107.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q107.setForeground(new java.awt.Color(240, 240, 240));
        q107.setText("q123");
        q107.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q107.setContentAreaFilled(false);
        q107.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q107.setName("Q107"); // NOI18N
        q107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q107ActionPerformed(evt);
            }
        });
        aa1.add(q107, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, 70, 60));

        q106.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q106.setForeground(new java.awt.Color(240, 240, 240));
        q106.setText("q123");
        q106.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q106.setContentAreaFilled(false);
        q106.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q106.setName("Q106"); // NOI18N
        q106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q106ActionPerformed(evt);
            }
        });
        aa1.add(q106, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 470, 70, 60));

        q105.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q105.setForeground(new java.awt.Color(240, 240, 240));
        q105.setText("q123");
        q105.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q105.setContentAreaFilled(false);
        q105.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q105.setName("Q105"); // NOI18N
        q105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q105ActionPerformed(evt);
            }
        });
        aa1.add(q105, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 80, 60));

        q104.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q104.setForeground(new java.awt.Color(240, 240, 240));
        q104.setText("q123");
        q104.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q104.setContentAreaFilled(false);
        q104.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q104.setName("Q104"); // NOI18N
        q104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q104ActionPerformed(evt);
            }
        });
        aa1.add(q104, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 70, 60));

        q103.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q103.setForeground(new java.awt.Color(240, 240, 240));
        q103.setText("q123");
        q103.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q103.setContentAreaFilled(false);
        q103.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q103.setName("Q103"); // NOI18N
        q103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q103ActionPerformed(evt);
            }
        });
        aa1.add(q103, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 80, 60));

        q99.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q99.setForeground(new java.awt.Color(240, 240, 240));
        q99.setText("q123");
        q99.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q99.setContentAreaFilled(false);
        q99.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q99.setName("Q99"); // NOI18N
        q99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q99ActionPerformed(evt);
            }
        });
        aa1.add(q99, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 580, 70, 60));

        q98.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q98.setForeground(new java.awt.Color(240, 240, 240));
        q98.setText("q123");
        q98.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q98.setContentAreaFilled(false);
        q98.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q98.setName("Q98"); // NOI18N
        q98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q98ActionPerformed(evt);
            }
        });
        aa1.add(q98, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 580, 70, 60));

        q95.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q95.setForeground(new java.awt.Color(240, 240, 240));
        q95.setText("q123");
        q95.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q95.setContentAreaFilled(false);
        q95.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q95.setName("Q95"); // NOI18N
        q95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q95ActionPerformed(evt);
            }
        });
        aa1.add(q95, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 580, 70, 60));

        q94.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q94.setForeground(new java.awt.Color(240, 240, 240));
        q94.setText("q123");
        q94.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q94.setContentAreaFilled(false);
        q94.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q94.setName("Q94"); // NOI18N
        q94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q94ActionPerformed(evt);
            }
        });
        aa1.add(q94, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 580, 70, 60));

        q93.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q93.setForeground(new java.awt.Color(240, 240, 240));
        q93.setText("q123");
        q93.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q93.setContentAreaFilled(false);
        q93.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q93.setName("Q93"); // NOI18N
        q93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q93ActionPerformed(evt);
            }
        });
        aa1.add(q93, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 680, 60, 80));

        q92.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q92.setForeground(new java.awt.Color(240, 240, 240));
        q92.setText("q123");
        q92.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q92.setContentAreaFilled(false);
        q92.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q92.setName("Q92"); // NOI18N
        q92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q92ActionPerformed(evt);
            }
        });
        aa1.add(q92, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 700, 70, 50));

        q86.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q86.setForeground(new java.awt.Color(240, 240, 240));
        q86.setText("q123");
        q86.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q86.setContentAreaFilled(false);
        q86.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q86.setName("Q86"); // NOI18N
        q86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q86ActionPerformed(evt);
            }
        });
        aa1.add(q86, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 690, 80, 70));

        q85.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q85.setForeground(new java.awt.Color(240, 240, 240));
        q85.setText("q123");
        q85.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q85.setContentAreaFilled(false);
        q85.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q85.setName("Q85"); // NOI18N
        q85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q85ActionPerformed(evt);
            }
        });
        aa1.add(q85, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 690, 80, 70));

        q84.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q84.setForeground(new java.awt.Color(240, 240, 240));
        q84.setText("q123");
        q84.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q84.setContentAreaFilled(false);
        q84.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q84.setName("Q84"); // NOI18N
        q84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q84ActionPerformed(evt);
            }
        });
        aa1.add(q84, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 790, 60, 70));

        q83.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q83.setForeground(new java.awt.Color(240, 240, 240));
        q83.setText("q123");
        q83.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q83.setContentAreaFilled(false);
        q83.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q83.setName("Q83"); // NOI18N
        q83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q83ActionPerformed(evt);
            }
        });
        aa1.add(q83, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 800, 70, 70));

        q82.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q82.setForeground(new java.awt.Color(240, 240, 240));
        q82.setText("q123");
        q82.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q82.setContentAreaFilled(false);
        q82.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q82.setName("Q82"); // NOI18N
        q82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q82ActionPerformed(evt);
            }
        });
        aa1.add(q82, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 800, 70, 70));

        q81.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q81.setForeground(new java.awt.Color(240, 240, 240));
        q81.setText("q123");
        q81.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q81.setContentAreaFilled(false);
        q81.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q81.setName("Q81"); // NOI18N
        q81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q81ActionPerformed(evt);
            }
        });
        aa1.add(q81, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 800, 70, 70));

        q79.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q79.setForeground(new java.awt.Color(240, 240, 240));
        q79.setText("q123");
        q79.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q79.setContentAreaFilled(false);
        q79.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q79.setName("Q79"); // NOI18N
        q79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q79ActionPerformed(evt);
            }
        });
        aa1.add(q79, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 800, 70, 70));

        q78.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q78.setForeground(new java.awt.Color(240, 240, 240));
        q78.setText("q123");
        q78.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q78.setContentAreaFilled(false);
        q78.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q78.setName("Q78"); // NOI18N
        q78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q78ActionPerformed(evt);
            }
        });
        aa1.add(q78, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 800, 70, 70));

        q77.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q77.setForeground(new java.awt.Color(240, 240, 240));
        q77.setText("q123");
        q77.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q77.setContentAreaFilled(false);
        q77.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q77.setName("Q77"); // NOI18N
        q77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q77ActionPerformed(evt);
            }
        });
        aa1.add(q77, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 800, 70, 70));

        q76.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q76.setForeground(new java.awt.Color(240, 240, 240));
        q76.setText("q123");
        q76.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q76.setContentAreaFilled(false);
        q76.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q76.setName("Q76"); // NOI18N
        q76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q76ActionPerformed(evt);
            }
        });
        aa1.add(q76, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 800, 70, 70));

        q75.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q75.setForeground(new java.awt.Color(240, 240, 240));
        q75.setText("q123");
        q75.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q75.setContentAreaFilled(false);
        q75.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q75.setName("Q75"); // NOI18N
        q75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q75ActionPerformed(evt);
            }
        });
        aa1.add(q75, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 890, 60, 80));

        q74.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q74.setForeground(new java.awt.Color(240, 240, 240));
        q74.setText("q123");
        q74.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q74.setContentAreaFilled(false);
        q74.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q74.setName("Q74"); // NOI18N
        q74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q74ActionPerformed(evt);
            }
        });
        aa1.add(q74, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 900, 70, 70));

        q72.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q72.setForeground(new java.awt.Color(240, 240, 240));
        q72.setText("q123");
        q72.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q72.setContentAreaFilled(false);
        q72.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q72.setName("Q72"); // NOI18N
        q72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q72ActionPerformed(evt);
            }
        });
        aa1.add(q72, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 900, 70, 70));

        q71.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q71.setForeground(new java.awt.Color(240, 240, 240));
        q71.setText("q123");
        q71.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q71.setContentAreaFilled(false);
        q71.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q71.setName("Q71"); // NOI18N
        q71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q71ActionPerformed(evt);
            }
        });
        aa1.add(q71, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 900, 70, 70));

        q68.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q68.setForeground(new java.awt.Color(240, 240, 240));
        q68.setText("q123");
        q68.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q68.setContentAreaFilled(false);
        q68.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q68.setName("Q68"); // NOI18N
        q68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q68ActionPerformed(evt);
            }
        });
        aa1.add(q68, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 910, 80, 60));

        q67.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q67.setForeground(new java.awt.Color(240, 240, 240));
        q67.setText("q123");
        q67.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q67.setContentAreaFilled(false);
        q67.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q67.setName("Q67"); // NOI18N
        q67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q67ActionPerformed(evt);
            }
        });
        aa1.add(q67, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 910, 80, 60));

        q66.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q66.setForeground(new java.awt.Color(240, 240, 240));
        q66.setText("q123");
        q66.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q66.setContentAreaFilled(false);
        q66.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q66.setName("Q66"); // NOI18N
        q66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q66ActionPerformed(evt);
            }
        });
        aa1.add(q66, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 980, 50, 80));

        q65.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q65.setForeground(new java.awt.Color(240, 240, 240));
        q65.setText("q123");
        q65.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q65.setContentAreaFilled(false);
        q65.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q65.setName("Q65"); // NOI18N
        q65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q65ActionPerformed(evt);
            }
        });
        aa1.add(q65, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 1000, 70, 60));

        q64.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q64.setForeground(new java.awt.Color(240, 240, 240));
        q64.setText("q123");
        q64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q64.setContentAreaFilled(false);
        q64.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q64.setName("Q64"); // NOI18N
        q64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q64ActionPerformed(evt);
            }
        });
        aa1.add(q64, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 1000, 70, 60));

        q63.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q63.setForeground(new java.awt.Color(240, 240, 240));
        q63.setText("q123");
        q63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q63.setContentAreaFilled(false);
        q63.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q63.setName("Q63"); // NOI18N
        q63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q63ActionPerformed(evt);
            }
        });
        aa1.add(q63, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 1000, 70, 60));

        q62.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q62.setForeground(new java.awt.Color(240, 240, 240));
        q62.setText("q123");
        q62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q62.setContentAreaFilled(false);
        q62.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q62.setName("Q62"); // NOI18N
        q62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q62ActionPerformed(evt);
            }
        });
        aa1.add(q62, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 990, 70, 70));

        q61.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q61.setForeground(new java.awt.Color(240, 240, 240));
        q61.setText("q123");
        q61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q61.setContentAreaFilled(false);
        q61.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q61.setName("Q61"); // NOI18N
        q61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q61ActionPerformed(evt);
            }
        });
        aa1.add(q61, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 980, 50, 80));

        q58.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q58.setForeground(new java.awt.Color(240, 240, 240));
        q58.setText("q123");
        q58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q58.setContentAreaFilled(false);
        q58.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q58.setName("Q58"); // NOI18N
        q58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q58ActionPerformed(evt);
            }
        });
        aa1.add(q58, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 990, 70, 70));

        q57.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q57.setForeground(new java.awt.Color(240, 240, 240));
        q57.setText("q123");
        q57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q57.setContentAreaFilled(false);
        q57.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q57.setName("Q57"); // NOI18N
        q57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q57ActionPerformed(evt);
            }
        });
        aa1.add(q57, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 990, 60, 70));

        q56.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q56.setForeground(new java.awt.Color(240, 240, 240));
        q56.setText("q123");
        q56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q56.setContentAreaFilled(false);
        q56.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q56.setName("Q56"); // NOI18N
        q56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q56ActionPerformed(evt);
            }
        });
        aa1.add(q56, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 990, 60, 70));

        q55.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q55.setForeground(new java.awt.Color(240, 240, 240));
        q55.setText("q123");
        q55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q55.setContentAreaFilled(false);
        q55.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q55.setName("Q55"); // NOI18N
        q55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q55ActionPerformed(evt);
            }
        });
        aa1.add(q55, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 1080, 50, 70));

        q54.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q54.setForeground(new java.awt.Color(240, 240, 240));
        q54.setText("q123");
        q54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q54.setContentAreaFilled(false);
        q54.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q54.setName("Q54"); // NOI18N
        q54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q54ActionPerformed(evt);
            }
        });
        aa1.add(q54, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 1090, 70, 60));

        q53.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q53.setForeground(new java.awt.Color(240, 240, 240));
        q53.setText("q123");
        q53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q53.setContentAreaFilled(false);
        q53.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q53.setName("Q53"); // NOI18N
        q53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q53ActionPerformed(evt);
            }
        });
        aa1.add(q53, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 1090, 60, 60));

        q52.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q52.setForeground(new java.awt.Color(240, 240, 240));
        q52.setText("q123");
        q52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q52.setContentAreaFilled(false);
        q52.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q52.setName("Q52"); // NOI18N
        q52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q52ActionPerformed(evt);
            }
        });
        aa1.add(q52, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 1090, 60, 60));

        q51.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q51.setForeground(new java.awt.Color(240, 240, 240));
        q51.setText("q123");
        q51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q51.setContentAreaFilled(false);
        q51.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q51.setName("Q51"); // NOI18N
        q51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q51ActionPerformed(evt);
            }
        });
        aa1.add(q51, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 1090, 70, 60));

        q49.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q49.setForeground(new java.awt.Color(240, 240, 240));
        q49.setText("q123");
        q49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q49.setContentAreaFilled(false);
        q49.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q49.setName("Q49"); // NOI18N
        q49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q49ActionPerformed(evt);
            }
        });
        aa1.add(q49, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 1090, 80, 60));

        q48.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q48.setForeground(new java.awt.Color(240, 240, 240));
        q48.setText("q123");
        q48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q48.setContentAreaFilled(false);
        q48.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q48.setName("Q48"); // NOI18N
        q48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q48ActionPerformed(evt);
            }
        });
        aa1.add(q48, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 1090, 80, 60));

        q47.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q47.setForeground(new java.awt.Color(240, 240, 240));
        q47.setText("q123");
        q47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q47.setContentAreaFilled(false);
        q47.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q47.setName("Q47"); // NOI18N
        q47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q47ActionPerformed(evt);
            }
        });
        aa1.add(q47, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 1090, 80, 60));

        q46.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q46.setForeground(new java.awt.Color(240, 240, 240));
        q46.setText("q123");
        q46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q46.setContentAreaFilled(false);
        q46.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q46.setName("Q46"); // NOI18N
        q46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q46ActionPerformed(evt);
            }
        });
        aa1.add(q46, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 1090, 80, 60));

        q45.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q45.setForeground(new java.awt.Color(240, 240, 240));
        q45.setText("q123");
        q45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q45.setContentAreaFilled(false);
        q45.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q45.setName("Q45"); // NOI18N
        q45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q45ActionPerformed(evt);
            }
        });
        aa1.add(q45, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 1090, 70, 60));

        q44.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q44.setForeground(new java.awt.Color(240, 240, 240));
        q44.setText("q123");
        q44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q44.setContentAreaFilled(false);
        q44.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q44.setName("Q44"); // NOI18N
        q44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q44ActionPerformed(evt);
            }
        });
        aa1.add(q44, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 1170, 50, 70));

        q43.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q43.setForeground(new java.awt.Color(240, 240, 240));
        q43.setText("q123");
        q43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q43.setContentAreaFilled(false);
        q43.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q43.setName("Q43"); // NOI18N
        q43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q43ActionPerformed(evt);
            }
        });
        aa1.add(q43, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 1190, 70, 50));

        q42.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q42.setForeground(new java.awt.Color(240, 240, 240));
        q42.setText("q123");
        q42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q42.setContentAreaFilled(false);
        q42.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q42.setName("Q42"); // NOI18N
        q42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q42ActionPerformed(evt);
            }
        });
        aa1.add(q42, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 1190, 70, 50));

        q41.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q41.setForeground(new java.awt.Color(240, 240, 240));
        q41.setText("q123");
        q41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q41.setContentAreaFilled(false);
        q41.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q41.setName("Q41"); // NOI18N
        q41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q41ActionPerformed(evt);
            }
        });
        aa1.add(q41, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 1180, 60, 60));

        q39.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q39.setForeground(new java.awt.Color(240, 240, 240));
        q39.setText("q123");
        q39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q39.setContentAreaFilled(false);
        q39.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q39.setName("Q39"); // NOI18N
        q39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q39ActionPerformed(evt);
            }
        });
        aa1.add(q39, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 1180, 70, 60));

        q38.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q38.setForeground(new java.awt.Color(240, 240, 240));
        q38.setText("q123");
        q38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q38.setContentAreaFilled(false);
        q38.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q38.setName("Q38"); // NOI18N
        q38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q38ActionPerformed(evt);
            }
        });
        aa1.add(q38, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 1180, 70, 60));

        q37.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q37.setForeground(new java.awt.Color(240, 240, 240));
        q37.setText("q123");
        q37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q37.setContentAreaFilled(false);
        q37.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q37.setName("Q37"); // NOI18N
        q37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q37ActionPerformed(evt);
            }
        });
        aa1.add(q37, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 1180, 70, 60));

        q36.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q36.setForeground(new java.awt.Color(240, 240, 240));
        q36.setText("q123");
        q36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q36.setContentAreaFilled(false);
        q36.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q36.setName("Q36"); // NOI18N
        q36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q36ActionPerformed(evt);
            }
        });
        aa1.add(q36, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 1180, 70, 60));

        q35.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q35.setForeground(new java.awt.Color(240, 240, 240));
        q35.setText("q123");
        q35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q35.setContentAreaFilled(false);
        q35.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q35.setName("Q35"); // NOI18N
        q35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q35ActionPerformed(evt);
            }
        });
        aa1.add(q35, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 1180, 70, 60));

        q34.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q34.setForeground(new java.awt.Color(240, 240, 240));
        q34.setText("q123");
        q34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q34.setContentAreaFilled(false);
        q34.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q34.setName("Q34"); // NOI18N
        q34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q34ActionPerformed(evt);
            }
        });
        aa1.add(q34, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 1180, 70, 60));

        q33.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q33.setForeground(new java.awt.Color(240, 240, 240));
        q33.setText("q123");
        q33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q33.setContentAreaFilled(false);
        q33.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q33.setName("Q33"); // NOI18N
        q33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q33ActionPerformed(evt);
            }
        });
        aa1.add(q33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 1250, 40, 80));

        q32.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q32.setForeground(new java.awt.Color(240, 240, 240));
        q32.setText("q123");
        q32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q32.setContentAreaFilled(false);
        q32.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q32.setName("Q32"); // NOI18N
        q32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q32ActionPerformed(evt);
            }
        });
        aa1.add(q32, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 1270, 70, 60));

        q31.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q31.setForeground(new java.awt.Color(240, 240, 240));
        q31.setText("q123");
        q31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q31.setContentAreaFilled(false);
        q31.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q31.setName("Q31"); // NOI18N
        q31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q31ActionPerformed(evt);
            }
        });
        aa1.add(q31, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 1270, 70, 60));

        q30.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q30.setForeground(new java.awt.Color(240, 240, 240));
        q30.setText("q123");
        q30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q30.setContentAreaFilled(false);
        q30.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q30.setName("Q30"); // NOI18N
        q30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q30ActionPerformed(evt);
            }
        });
        aa1.add(q30, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 1270, 70, 60));

        q24.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q24.setForeground(new java.awt.Color(240, 240, 240));
        q24.setText("q123");
        q24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q24.setContentAreaFilled(false);
        q24.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q24.setName("Q24"); // NOI18N
        q24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q24ActionPerformed(evt);
            }
        });
        aa1.add(q24, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 1270, 80, 60));

        q29.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q29.setForeground(new java.awt.Color(240, 240, 240));
        q29.setText("q123");
        q29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q29.setContentAreaFilled(false);
        q29.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q29.setName("Q29"); // NOI18N
        q29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q29ActionPerformed(evt);
            }
        });
        aa1.add(q29, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 1270, 70, 60));

        q28.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q28.setForeground(new java.awt.Color(240, 240, 240));
        q28.setText("q123");
        q28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q28.setContentAreaFilled(false);
        q28.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q28.setName("Q28"); // NOI18N
        q28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q28ActionPerformed(evt);
            }
        });
        aa1.add(q28, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 1270, 70, 60));

        q27.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q27.setForeground(new java.awt.Color(240, 240, 240));
        q27.setText("q123");
        q27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q27.setContentAreaFilled(false);
        q27.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q27.setName("Q27"); // NOI18N
        q27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q27ActionPerformed(evt);
            }
        });
        aa1.add(q27, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 1270, 70, 60));

        q26.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q26.setForeground(new java.awt.Color(240, 240, 240));
        q26.setText("q123");
        q26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q26.setContentAreaFilled(false);
        q26.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q26.setName("Q26"); // NOI18N
        q26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q26ActionPerformed(evt);
            }
        });
        aa1.add(q26, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 1270, 80, 60));

        q22.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q22.setForeground(new java.awt.Color(240, 240, 240));
        q22.setText("q123");
        q22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q22.setContentAreaFilled(false);
        q22.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q22.setName("Q22"); // NOI18N
        q22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q22ActionPerformed(evt);
            }
        });
        aa1.add(q22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 1360, 40, 80));

        q21.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q21.setForeground(new java.awt.Color(240, 240, 240));
        q21.setText("q123");
        q21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q21.setContentAreaFilled(false);
        q21.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q21.setName("Q21"); // NOI18N
        q21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q21ActionPerformed(evt);
            }
        });
        aa1.add(q21, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 1380, 70, 60));

        q19.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q19.setForeground(new java.awt.Color(240, 240, 240));
        q19.setText("q123");
        q19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q19.setContentAreaFilled(false);
        q19.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q19.setName("Q19"); // NOI18N
        q19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q19ActionPerformed(evt);
            }
        });
        aa1.add(q19, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 1380, 70, 60));

        q18.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q18.setForeground(new java.awt.Color(240, 240, 240));
        q18.setText("q123");
        q18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q18.setContentAreaFilled(false);
        q18.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q18.setName("Q18"); // NOI18N
        q18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q18ActionPerformed(evt);
            }
        });
        aa1.add(q18, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 1380, 70, 60));

        q17.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q17.setForeground(new java.awt.Color(240, 240, 240));
        q17.setText("q123");
        q17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q17.setContentAreaFilled(false);
        q17.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q17.setName("Q17"); // NOI18N
        q17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q17ActionPerformed(evt);
            }
        });
        aa1.add(q17, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 1380, 70, 60));

        q16.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q16.setForeground(new java.awt.Color(240, 240, 240));
        q16.setText("q123");
        q16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q16.setContentAreaFilled(false);
        q16.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q16.setName("Q16"); // NOI18N
        q16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q16ActionPerformed(evt);
            }
        });
        aa1.add(q16, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 1380, 70, 60));

        q15.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q15.setForeground(new java.awt.Color(240, 240, 240));
        q15.setText("q123");
        q15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q15.setContentAreaFilled(false);
        q15.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q15.setName("Q15"); // NOI18N
        q15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q15ActionPerformed(evt);
            }
        });
        aa1.add(q15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 1380, 70, 60));

        q14.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q14.setForeground(new java.awt.Color(240, 240, 240));
        q14.setText("q123");
        q14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q14.setContentAreaFilled(false);
        q14.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q14.setName("Q14"); // NOI18N
        q14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q14ActionPerformed(evt);
            }
        });
        aa1.add(q14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 1380, 70, 50));

        q13.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q13.setForeground(new java.awt.Color(240, 240, 240));
        q13.setText("q123");
        q13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q13.setContentAreaFilled(false);
        q13.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q13.setName("Q13"); // NOI18N
        q13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q13ActionPerformed(evt);
            }
        });
        aa1.add(q13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 1380, 70, 50));

        q12.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q12.setForeground(new java.awt.Color(240, 240, 240));
        q12.setText("q123");
        q12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q12.setContentAreaFilled(false);
        q12.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q12.setName("Q12"); // NOI18N
        q12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q12ActionPerformed(evt);
            }
        });
        aa1.add(q12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 1380, 60, 60));

        q11.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q11.setForeground(new java.awt.Color(240, 240, 240));
        q11.setText("q123");
        q11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q11.setContentAreaFilled(false);
        q11.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q11.setName("Q11"); // NOI18N
        q11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q11ActionPerformed(evt);
            }
        });
        aa1.add(q11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 1460, 40, 80));

        q9.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q9.setForeground(new java.awt.Color(240, 240, 240));
        q9.setText("q123");
        q9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q9.setContentAreaFilled(false);
        q9.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q9.setName("Q9"); // NOI18N
        q9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q9ActionPerformed(evt);
            }
        });
        aa1.add(q9, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 1480, 70, 60));

        q8.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q8.setForeground(new java.awt.Color(240, 240, 240));
        q8.setText("q123");
        q8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q8.setContentAreaFilled(false);
        q8.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q8.setName("Q8"); // NOI18N
        q8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q8ActionPerformed(evt);
            }
        });
        aa1.add(q8, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 1480, 70, 60));

        q7.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q7.setForeground(new java.awt.Color(240, 240, 240));
        q7.setText("q123");
        q7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q7.setContentAreaFilled(false);
        q7.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q7.setName("Q7"); // NOI18N
        q7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q7ActionPerformed(evt);
            }
        });
        aa1.add(q7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 1480, 70, 60));

        q6.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q6.setForeground(new java.awt.Color(240, 240, 240));
        q6.setText("q123");
        q6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q6.setContentAreaFilled(false);
        q6.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q6.setName("Q6"); // NOI18N
        q6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q6ActionPerformed(evt);
            }
        });
        aa1.add(q6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 1480, 70, 60));

        q5.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q5.setForeground(new java.awt.Color(240, 240, 240));
        q5.setText("q123");
        q5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q5.setContentAreaFilled(false);
        q5.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q5.setName("Q5"); // NOI18N
        q5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q5ActionPerformed(evt);
            }
        });
        aa1.add(q5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 1480, 70, 60));

        q4.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q4.setForeground(new java.awt.Color(240, 240, 240));
        q4.setText("q123");
        q4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q4.setContentAreaFilled(false);
        q4.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q4.setName("Q4"); // NOI18N
        q4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q4ActionPerformed(evt);
            }
        });
        aa1.add(q4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 1480, 70, 60));

        q3.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q3.setForeground(new java.awt.Color(240, 240, 240));
        q3.setText("q123");
        q3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q3.setContentAreaFilled(false);
        q3.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q3.setName("Q3"); // NOI18N
        q3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q3ActionPerformed(evt);
            }
        });
        aa1.add(q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 1480, 70, 60));

        q2.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q2.setForeground(new java.awt.Color(240, 240, 240));
        q2.setText("q123");
        q2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q2.setContentAreaFilled(false);
        q2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q2.setName("Q2"); // NOI18N
        q2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q2ActionPerformed(evt);
            }
        });
        aa1.add(q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 1480, 70, 60));

        q1.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q1.setForeground(new java.awt.Color(240, 240, 240));
        q1.setText("q123");
        q1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q1.setContentAreaFilled(false);
        q1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q1.setName("Q1"); // NOI18N
        q1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q1ActionPerformed(evt);
            }
        });
        aa1.add(q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 1480, 70, 60));

        q10.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q10.setForeground(new java.awt.Color(240, 240, 240));
        q10.setText("q123");
        q10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q10.setContentAreaFilled(false);
        q10.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q10.setName("Q10"); // NOI18N
        q10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q10ActionPerformed(evt);
            }
        });
        aa1.add(q10, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 1480, 70, 60));

        q20.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q20.setForeground(new java.awt.Color(240, 240, 240));
        q20.setText("q123");
        q20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q20.setContentAreaFilled(false);
        q20.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q20.setName("Q20"); // NOI18N
        q20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q20ActionPerformed(evt);
            }
        });
        aa1.add(q20, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 1380, 70, 60));

        q40.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q40.setForeground(new java.awt.Color(240, 240, 240));
        q40.setText("q123");
        q40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q40.setContentAreaFilled(false);
        q40.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q40.setName("Q40"); // NOI18N
        q40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q40ActionPerformed(evt);
            }
        });
        aa1.add(q40, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 1180, 70, 60));

        q50.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q50.setForeground(new java.awt.Color(240, 240, 240));
        q50.setText("q123");
        q50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q50.setContentAreaFilled(false);
        q50.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q50.setName("Q50"); // NOI18N
        q50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q50ActionPerformed(evt);
            }
        });
        aa1.add(q50, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 1080, 50, 70));

        q59.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q59.setForeground(new java.awt.Color(240, 240, 240));
        q59.setText("q123");
        q59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q59.setContentAreaFilled(false);
        q59.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q59.setName("Q59"); // NOI18N
        q59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q59ActionPerformed(evt);
            }
        });
        aa1.add(q59, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 990, 70, 70));

        q60.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q60.setForeground(new java.awt.Color(240, 240, 240));
        q60.setText("q123");
        q60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q60.setContentAreaFilled(false);
        q60.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q60.setName("Q60"); // NOI18N
        q60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q60ActionPerformed(evt);
            }
        });
        aa1.add(q60, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 990, 70, 70));

        q70.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q70.setForeground(new java.awt.Color(240, 240, 240));
        q70.setText("q123");
        q70.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q70.setContentAreaFilled(false);
        q70.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q70.setName("Q70"); // NOI18N
        q70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q70ActionPerformed(evt);
            }
        });
        aa1.add(q70, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 900, 70, 70));

        q80.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q80.setForeground(new java.awt.Color(240, 240, 240));
        q80.setText("q123");
        q80.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q80.setContentAreaFilled(false);
        q80.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q80.setName("Q80"); // NOI18N
        q80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q80ActionPerformed(evt);
            }
        });
        aa1.add(q80, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 800, 70, 70));

        q144.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q144.setForeground(new java.awt.Color(240, 240, 240));
        q144.setText("q123");
        q144.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q144.setContentAreaFilled(false);
        q144.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q144.setName("Q144"); // NOI18N
        q144.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q144ActionPerformed(evt);
            }
        });
        aa1.add(q144, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 1430, 70, 50));

        q145.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q145.setForeground(new java.awt.Color(240, 240, 240));
        q145.setText("q123");
        q145.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q145.setContentAreaFilled(false);
        q145.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q145.setName("Q145"); // NOI18N
        q145.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q145ActionPerformed(evt);
            }
        });
        aa1.add(q145, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 1090, 30, 80));

        q147.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q147.setForeground(new java.awt.Color(240, 240, 240));
        q147.setText("q123");
        q147.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q147.setContentAreaFilled(false);
        q147.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q147.setName("Q147"); // NOI18N
        q147.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q147ActionPerformed(evt);
            }
        });
        aa1.add(q147, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 650, 80, 50));

        q146.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q146.setForeground(new java.awt.Color(240, 240, 240));
        q146.setText("q123");
        q146.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q146.setContentAreaFilled(false);
        q146.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q146.setName("Q146"); // NOI18N
        q146.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q146ActionPerformed(evt);
            }
        });
        aa1.add(q146, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 640, 80, 60));

        q91.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        q91.setForeground(new java.awt.Color(240, 240, 240));
        q91.setText("q123");
        q91.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q91.setContentAreaFilled(false);
        q91.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        q91.setName("Q91"); // NOI18N
        q91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q91ActionPerformed(evt);
            }
        });
        aa1.add(q91, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 680, 70, 80));

        jBPrueba.setText("Prueba");
        jBPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPruebaActionPerformed(evt);
            }
        });
        aa1.add(jBPrueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 1630, -1, -1));

        jBPrueba1.setText("Enter");
        jBPrueba1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPrueba1ActionPerformed(evt);
            }
        });
        aa1.add(jBPrueba1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 1690, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Alumbrado Division Insdustrial Sopraval Rev. 2 - 2015 (cambio entretecho)-Presentación.png"))); // NOI18N
        aa1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1100, -1));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 15, 57);
        add(aa1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void q123ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q123ActionPerformed
		new MantOrAskGUI(this.q123.getText(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q123ActionPerformed

    private void q122ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q122ActionPerformed
		new MantOrAskGUI(this.q122.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q122ActionPerformed

    private void q125ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q125ActionPerformed
		new MantOrAskGUI(this.q125.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q125ActionPerformed

    private void q124ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q124ActionPerformed
		new MantOrAskGUI(this.q124.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q124ActionPerformed

    private void q126ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q126ActionPerformed
		new MantOrAskGUI(this.q126.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q126ActionPerformed

    private void q127ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q127ActionPerformed
		new MantOrAskGUI(this.q127.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q127ActionPerformed

    private void q128ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q128ActionPerformed
		new MantOrAskGUI(this.q128.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q128ActionPerformed

    private void q129ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q129ActionPerformed
		new MantOrAskGUI(this.q129.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q129ActionPerformed

    private void q130ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q130ActionPerformed
		new MantOrAskGUI(this.q130.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q130ActionPerformed

    private void q131ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q131ActionPerformed
		new MantOrAskGUI(this.q131.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q131ActionPerformed

    private void q132ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q132ActionPerformed
		new MantOrAskGUI(this.q132.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q132ActionPerformed

    private void q133ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q133ActionPerformed
		new MantOrAskGUI(this.q133.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q133ActionPerformed

    private void q134ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q134ActionPerformed
		new MantOrAskGUI(this.q134.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q134ActionPerformed

    private void q135ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q135ActionPerformed
		new MantOrAskGUI(this.q135.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q135ActionPerformed

    private void q136ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q136ActionPerformed
		new MantOrAskGUI(this.q136.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q136ActionPerformed

    private void q137ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q137ActionPerformed
		new MantOrAskGUI(this.q137.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q137ActionPerformed

    private void q138ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q138ActionPerformed
		new MantOrAskGUI(this.q138.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q138ActionPerformed

    private void q121ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q121ActionPerformed
		new MantOrAskGUI(this.q121.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q121ActionPerformed

    private void q101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q101ActionPerformed
		new MantOrAskGUI(this.q101.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q101ActionPerformed

    private void q102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q102ActionPerformed
		new MantOrAskGUI(this.q102.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q102ActionPerformed

    private void q103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q103ActionPerformed
		new MantOrAskGUI(this.q103.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q103ActionPerformed

    private void q104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q104ActionPerformed
		new MantOrAskGUI(this.q104.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q104ActionPerformed

    private void q105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q105ActionPerformed
		new MantOrAskGUI(this.q105.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q105ActionPerformed

    private void q106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q106ActionPerformed
		new MantOrAskGUI(this.q106.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q106ActionPerformed

    private void q107ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q107ActionPerformed
		new MantOrAskGUI(this.q107.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q107ActionPerformed

    private void q108ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q108ActionPerformed
		new MantOrAskGUI(this.q108.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q108ActionPerformed

    private void q109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q109ActionPerformed
		new MantOrAskGUI(this.q109.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q109ActionPerformed

    private void q110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q110ActionPerformed
		new MantOrAskGUI(this.q110.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q110ActionPerformed

    private void q111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q111ActionPerformed
		new MantOrAskGUI(this.q111.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q111ActionPerformed

    private void q112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q112ActionPerformed
		new MantOrAskGUI(this.q112.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q112ActionPerformed

    private void q113ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q113ActionPerformed
		new MantOrAskGUI(this.q113.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q113ActionPerformed

    private void q114ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q114ActionPerformed
		new MantOrAskGUI(this.q114.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q114ActionPerformed

    private void q115ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q115ActionPerformed
		new MantOrAskGUI(this.q115.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q115ActionPerformed

    private void q116ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q116ActionPerformed
		new MantOrAskGUI(this.q116.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q116ActionPerformed

    private void q117ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q117ActionPerformed
		new MantOrAskGUI(this.q117.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q117ActionPerformed

    private void q118ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q118ActionPerformed
		new MantOrAskGUI(this.q118.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q118ActionPerformed

    private void q119ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q119ActionPerformed
		new MantOrAskGUI(this.q119.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q119ActionPerformed

    private void q120ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q120ActionPerformed
		new MantOrAskGUI(this.q120.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q120ActionPerformed

    private void q90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q90ActionPerformed
		new MantOrAskGUI(this.q90.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q90ActionPerformed

    private void q91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q91ActionPerformed
		new MantOrAskGUI(this.q91.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q91ActionPerformed

    private void q92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q92ActionPerformed
		new MantOrAskGUI(this.q92.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q92ActionPerformed

    private void q93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q93ActionPerformed
		new MantOrAskGUI(this.q93.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q93ActionPerformed

    private void q94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q94ActionPerformed
		new MantOrAskGUI(this.q94.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q94ActionPerformed

    private void q95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q95ActionPerformed
		new MantOrAskGUI(this.q95.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q95ActionPerformed

    private void q98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q98ActionPerformed
		new MantOrAskGUI(this.q98.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q98ActionPerformed

    private void q99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q99ActionPerformed
		new MantOrAskGUI(this.q99.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q99ActionPerformed

    private void q80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q80ActionPerformed
		new MantOrAskGUI(this.q80.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q80ActionPerformed

    private void q81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q81ActionPerformed
		new MantOrAskGUI(this.q81.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q81ActionPerformed

    private void q82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q82ActionPerformed
		new MantOrAskGUI(this.q82.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q82ActionPerformed

    private void q83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q83ActionPerformed
		new MantOrAskGUI(this.q83.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q83ActionPerformed

    private void q84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q84ActionPerformed
		new MantOrAskGUI(this.q84.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q84ActionPerformed

    private void q85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q85ActionPerformed
		new MantOrAskGUI(this.q85.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q85ActionPerformed

    private void q86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q86ActionPerformed
		new MantOrAskGUI(this.q86.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q86ActionPerformed

    private void q70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q70ActionPerformed
		new MantOrAskGUI(this.q70.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q70ActionPerformed

    private void q71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q71ActionPerformed
		new MantOrAskGUI(this.q71.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q71ActionPerformed

    private void q72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q72ActionPerformed
		new MantOrAskGUI(this.q72.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q72ActionPerformed

    private void q74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q74ActionPerformed
		new MantOrAskGUI(this.q74.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q74ActionPerformed

    private void q75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q75ActionPerformed
		new MantOrAskGUI(this.q75.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q75ActionPerformed

    private void q76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q76ActionPerformed
		new MantOrAskGUI(this.q76.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q76ActionPerformed

    private void q77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q77ActionPerformed
		new MantOrAskGUI(this.q77.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q77ActionPerformed

    private void q78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q78ActionPerformed
		new MantOrAskGUI(this.q78.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q78ActionPerformed

    private void q79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q79ActionPerformed
		new MantOrAskGUI(this.q79.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q79ActionPerformed

    private void q60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q60ActionPerformed
		new MantOrAskGUI(this.q60.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q60ActionPerformed

    private void q61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q61ActionPerformed
		new MantOrAskGUI(this.q61.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q61ActionPerformed

    private void q62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q62ActionPerformed
		new MantOrAskGUI(this.q62.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q62ActionPerformed

    private void q63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q63ActionPerformed
		new MantOrAskGUI(this.q63.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q63ActionPerformed

    private void q64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q64ActionPerformed
		new MantOrAskGUI(this.q64.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q64ActionPerformed

    private void q65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q65ActionPerformed
		new MantOrAskGUI(this.q65.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q65ActionPerformed

    private void q66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q66ActionPerformed
		new MantOrAskGUI(this.q66.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q66ActionPerformed

    private void q67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q67ActionPerformed
		new MantOrAskGUI(this.q67.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q67ActionPerformed

    private void q68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q68ActionPerformed
		new MantOrAskGUI(this.q68.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q68ActionPerformed

    private void q59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q59ActionPerformed
		new MantOrAskGUI(this.q59.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q59ActionPerformed

    private void q50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q50ActionPerformed
		new MantOrAskGUI(this.q50.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q50ActionPerformed

    private void q51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q51ActionPerformed
		new MantOrAskGUI(this.q51.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q51ActionPerformed

    private void q52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q52ActionPerformed
		new MantOrAskGUI(this.q52.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q52ActionPerformed

    private void q53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q53ActionPerformed
		new MantOrAskGUI(this.q53.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q53ActionPerformed

    private void q54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q54ActionPerformed
		new MantOrAskGUI(this.q54.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q54ActionPerformed

    private void q55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q55ActionPerformed
		new MantOrAskGUI(this.q55.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q55ActionPerformed

    private void q56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q56ActionPerformed
		new MantOrAskGUI(this.q56.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q56ActionPerformed

    private void q57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q57ActionPerformed
		new MantOrAskGUI(this.q57.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q57ActionPerformed

    private void q58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q58ActionPerformed
		new MantOrAskGUI(this.q58.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q58ActionPerformed

    private void q40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q40ActionPerformed
		new MantOrAskGUI(this.q40.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q40ActionPerformed

    private void q41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q41ActionPerformed
		new MantOrAskGUI(this.q41.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q41ActionPerformed

    private void q42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q42ActionPerformed
		new MantOrAskGUI(this.q42.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q42ActionPerformed

    private void q43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q43ActionPerformed
		new MantOrAskGUI(this.q43.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q43ActionPerformed

    private void q44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q44ActionPerformed
		new MantOrAskGUI(this.q44.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q44ActionPerformed

    private void q45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q45ActionPerformed
		new MantOrAskGUI(this.q45.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q45ActionPerformed

    private void q46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q46ActionPerformed
		new MantOrAskGUI(this.q46.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q46ActionPerformed

    private void q47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q47ActionPerformed
		new MantOrAskGUI(this.q47.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q47ActionPerformed

    private void q48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q48ActionPerformed
		new MantOrAskGUI(this.q48.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q48ActionPerformed

    private void q49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q49ActionPerformed
		new MantOrAskGUI(this.q49.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q49ActionPerformed

    private void q30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q30ActionPerformed
		new MantOrAskGUI(this.q30.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q30ActionPerformed

    private void q31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q31ActionPerformed
		new MantOrAskGUI(this.q31.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q31ActionPerformed

    private void q32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q32ActionPerformed
		new MantOrAskGUI(this.q32.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q32ActionPerformed

    private void q33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q33ActionPerformed
		new MantOrAskGUI(this.q33.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q33ActionPerformed

    private void q34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q34ActionPerformed
		new MantOrAskGUI(this.q34.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q34ActionPerformed

    private void q35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q35ActionPerformed
		new MantOrAskGUI(this.q35.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q35ActionPerformed

    private void q36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q36ActionPerformed
		new MantOrAskGUI(this.q36.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q36ActionPerformed

    private void q37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q37ActionPerformed
		new MantOrAskGUI(this.q37.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q37ActionPerformed

    private void q38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q38ActionPerformed
		new MantOrAskGUI(this.q38.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q38ActionPerformed

    private void q39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q39ActionPerformed
		new MantOrAskGUI(this.q39.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q39ActionPerformed

    private void q20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q20ActionPerformed
		new MantOrAskGUI(this.q20.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q20ActionPerformed

    private void q21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q21ActionPerformed
		new MantOrAskGUI(this.q21.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q21ActionPerformed

    private void q22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q22ActionPerformed
		new MantOrAskGUI(this.q22.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q22ActionPerformed

    private void q26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q26ActionPerformed
		new MantOrAskGUI(this.q26.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q26ActionPerformed

    private void q24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q24ActionPerformed
		new MantOrAskGUI(this.q24.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q24ActionPerformed

    private void q27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q27ActionPerformed
		new MantOrAskGUI(this.q27.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q27ActionPerformed

    private void q28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q28ActionPerformed
		new MantOrAskGUI(this.q28.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q28ActionPerformed

    private void q29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q29ActionPerformed
		new MantOrAskGUI(this.q29.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q29ActionPerformed

    private void q10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q10ActionPerformed
		new MantOrAskGUI(this.q10.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q10ActionPerformed

    private void q11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q11ActionPerformed
		new MantOrAskGUI(this.q11.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q11ActionPerformed

    private void q12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q12ActionPerformed
		new MantOrAskGUI(this.q12.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q12ActionPerformed

    private void q13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q13ActionPerformed
		new MantOrAskGUI(this.q13.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q13ActionPerformed

    private void q14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q14ActionPerformed
		new MantOrAskGUI(this.q14.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q14ActionPerformed

    private void q15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q15ActionPerformed
		new MantOrAskGUI(this.q15.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q15ActionPerformed

    private void q16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q16ActionPerformed
		new MantOrAskGUI(this.q16.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q16ActionPerformed

    private void q17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q17ActionPerformed
		new MantOrAskGUI(this.q17.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q17ActionPerformed

    private void q18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q18ActionPerformed
		new MantOrAskGUI(this.q18.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q18ActionPerformed

    private void q19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q19ActionPerformed
		new MantOrAskGUI(this.q19.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q19ActionPerformed

    private void q1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q1ActionPerformed
		new MantOrAskGUI(this.q1.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q1ActionPerformed

    private void q2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q2ActionPerformed
		new MantOrAskGUI(this.q2.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q2ActionPerformed

    private void q3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q3ActionPerformed
		new MantOrAskGUI(this.q3.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q3ActionPerformed

    private void q4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q4ActionPerformed
		new MantOrAskGUI(this.q4.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q4ActionPerformed

    private void q5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q5ActionPerformed
		new MantOrAskGUI(this.q5.getName(), this.user, this).setVisible(true);
    }//GEN-LAST:event_q5ActionPerformed

    private void q6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q6ActionPerformed
		new MantOrAskGUI(this.q6.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q6ActionPerformed

    private void q7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q7ActionPerformed
		new MantOrAskGUI(this.q7.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q7ActionPerformed

    private void q8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q8ActionPerformed
		new MantOrAskGUI(this.q8.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q8ActionPerformed

    private void q9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q9ActionPerformed
		new MantOrAskGUI(this.q9.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q9ActionPerformed

    private void q139ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q139ActionPerformed
		new MantOrAskGUI(this.q139.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q139ActionPerformed

    private void q140ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q140ActionPerformed
		new MantOrAskGUI(this.q140.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q140ActionPerformed

    private void q141ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q141ActionPerformed
		new MantOrAskGUI(this.q141.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q141ActionPerformed

    private void q146ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q146ActionPerformed
		new MantOrAskGUI(this.q146.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q146ActionPerformed

    private void q147ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q147ActionPerformed
		new MantOrAskGUI(this.q147.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q147ActionPerformed

    private void q145ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q145ActionPerformed
		new MantOrAskGUI(this.q145.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q145ActionPerformed

    private void q144ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q144ActionPerformed
		new MantOrAskGUI(this.q144.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q144ActionPerformed

    private void q142ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q142ActionPerformed
		new MantOrAskGUI(this.q142.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q142ActionPerformed

    private void q143ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q143ActionPerformed
		new MantOrAskGUI(this.q143.getName(), this.user, this.jp).setVisible(true);
    }//GEN-LAST:event_q143ActionPerformed

    private void jBPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPruebaActionPerformed

		this.jBPrueba1.setEnabled(true);
		this.jBPrueba1.setVisible(true);

    }//GEN-LAST:event_jBPruebaActionPerformed

    private void jBPrueba1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPrueba1ActionPerformed

		this.aviso(new BLL.Equipos().busquedaEquipos(jb));

    }//GEN-LAST:event_jBPrueba1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aa1;
    private javax.swing.JButton jBPrueba;
    private javax.swing.JButton jBPrueba1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton q1;
    private javax.swing.JButton q10;
    private javax.swing.JButton q101;
    private javax.swing.JButton q102;
    private javax.swing.JButton q103;
    private javax.swing.JButton q104;
    private javax.swing.JButton q105;
    private javax.swing.JButton q106;
    private javax.swing.JButton q107;
    private javax.swing.JButton q108;
    private javax.swing.JButton q109;
    private javax.swing.JButton q11;
    private javax.swing.JButton q110;
    private javax.swing.JButton q111;
    private javax.swing.JButton q112;
    private javax.swing.JButton q113;
    private javax.swing.JButton q114;
    private javax.swing.JButton q115;
    private javax.swing.JButton q116;
    private javax.swing.JButton q117;
    private javax.swing.JButton q118;
    private javax.swing.JButton q119;
    private javax.swing.JButton q12;
    private javax.swing.JButton q120;
    private javax.swing.JButton q121;
    private javax.swing.JButton q122;
    private javax.swing.JButton q123;
    private javax.swing.JButton q124;
    private javax.swing.JButton q125;
    private javax.swing.JButton q126;
    private javax.swing.JButton q127;
    private javax.swing.JButton q128;
    private javax.swing.JButton q129;
    private javax.swing.JButton q13;
    private javax.swing.JButton q130;
    private javax.swing.JButton q131;
    private javax.swing.JButton q132;
    private javax.swing.JButton q133;
    private javax.swing.JButton q134;
    private javax.swing.JButton q135;
    private javax.swing.JButton q136;
    private javax.swing.JButton q137;
    private javax.swing.JButton q138;
    private javax.swing.JButton q139;
    private javax.swing.JButton q14;
    private javax.swing.JButton q140;
    private javax.swing.JButton q141;
    private javax.swing.JButton q142;
    private javax.swing.JButton q143;
    private javax.swing.JButton q144;
    private javax.swing.JButton q145;
    private javax.swing.JButton q146;
    private javax.swing.JButton q147;
    private javax.swing.JButton q15;
    private javax.swing.JButton q16;
    private javax.swing.JButton q17;
    private javax.swing.JButton q18;
    private javax.swing.JButton q19;
    private javax.swing.JButton q2;
    private javax.swing.JButton q20;
    private javax.swing.JButton q21;
    private javax.swing.JButton q22;
    private javax.swing.JButton q24;
    private javax.swing.JButton q26;
    private javax.swing.JButton q27;
    private javax.swing.JButton q28;
    private javax.swing.JButton q29;
    private javax.swing.JButton q3;
    private javax.swing.JButton q30;
    private javax.swing.JButton q31;
    private javax.swing.JButton q32;
    private javax.swing.JButton q33;
    private javax.swing.JButton q34;
    private javax.swing.JButton q35;
    private javax.swing.JButton q36;
    private javax.swing.JButton q37;
    private javax.swing.JButton q38;
    private javax.swing.JButton q39;
    private javax.swing.JButton q4;
    private javax.swing.JButton q40;
    private javax.swing.JButton q41;
    private javax.swing.JButton q42;
    private javax.swing.JButton q43;
    private javax.swing.JButton q44;
    private javax.swing.JButton q45;
    private javax.swing.JButton q46;
    private javax.swing.JButton q47;
    private javax.swing.JButton q48;
    private javax.swing.JButton q49;
    private javax.swing.JButton q5;
    private javax.swing.JButton q50;
    private javax.swing.JButton q51;
    private javax.swing.JButton q52;
    private javax.swing.JButton q53;
    private javax.swing.JButton q54;
    private javax.swing.JButton q55;
    private javax.swing.JButton q56;
    private javax.swing.JButton q57;
    private javax.swing.JButton q58;
    private javax.swing.JButton q59;
    private javax.swing.JButton q6;
    private javax.swing.JButton q60;
    private javax.swing.JButton q61;
    private javax.swing.JButton q62;
    private javax.swing.JButton q63;
    private javax.swing.JButton q64;
    private javax.swing.JButton q65;
    private javax.swing.JButton q66;
    private javax.swing.JButton q67;
    private javax.swing.JButton q68;
    private javax.swing.JButton q7;
    private javax.swing.JButton q70;
    private javax.swing.JButton q71;
    private javax.swing.JButton q72;
    private javax.swing.JButton q74;
    private javax.swing.JButton q75;
    private javax.swing.JButton q76;
    private javax.swing.JButton q77;
    private javax.swing.JButton q78;
    private javax.swing.JButton q79;
    private javax.swing.JButton q8;
    private javax.swing.JButton q80;
    private javax.swing.JButton q81;
    private javax.swing.JButton q82;
    private javax.swing.JButton q83;
    private javax.swing.JButton q84;
    private javax.swing.JButton q85;
    private javax.swing.JButton q86;
    private javax.swing.JButton q9;
    private javax.swing.JButton q90;
    private javax.swing.JButton q91;
    private javax.swing.JButton q92;
    private javax.swing.JButton q93;
    private javax.swing.JButton q94;
    private javax.swing.JButton q95;
    private javax.swing.JButton q98;
    private javax.swing.JButton q99;
    // End of variables declaration//GEN-END:variables
}
