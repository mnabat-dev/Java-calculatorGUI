/**
 * Beschreibung
 * Ein einfacher Taschenrechner mit Jframe
 * @Mahmoud Nabat (MN) 
 */
 
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;

public class TaschenrechnerGUI extends JFrame {
  // start attributes
  private JButton bnull = new JButton();
  private JButton beins = new JButton();
  private JButton bzwei = new JButton();
  private JButton bdrei = new JButton();
  private JButton bvier = new JButton();
  private JButton bfuenf = new JButton();
  private JButton bsechs = new JButton();
  private JButton bsieben = new JButton();
  private JButton bacht = new JButton();
  private JButton bneun = new JButton();
  private JButton bkomma = new JButton();
  private JButton bgleich = new JButton();
  private JButton bplus = new JButton();
  private JButton bminus = new JButton();
  private JButton bmal = new JButton();
  private JButton bgeteilt = new JButton();
  private JButton bleeren = new JButton();
  private JButton bnegativ = new JButton();
  private JButton bprozent = new JButton();
  private JTextField jtfeld = new JTextField();
  private JOptionPane jOptionPane1 = new JOptionPane();
  // end attributes
  
  public TaschenrechnerGUI() { 
    // Frame init
    super();
    // 2. Add the KeyListener
    jtfeld.addKeyListener(new KeyAdapter() {
      @Override
      public void keyPressed(KeyEvent e) {
        int keycode = e.getKeyCode() ;
        if ( keycode == KeyEvent.VK_ENTER) {
          bgleich.doClick();
        } else if (keycode == KeyEvent.VK_Q || keycode == KeyEvent.VK_ESCAPE ) {
          dispose();  
          }
      }
    });
    
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 319; 
    int frameHeight = 278;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("TaschenrechnerGUI");
    setResizable(false);
    Container cp = getContentPane();
    cp.setBackground(Color.WHITE);
    cp.setLayout(null);
    // start components
    
    bnull.setBounds(8, 200, 144, 32);
    bnull.setFont(new Font("Dialog", Font.BOLD, 11));
    bnull.setText("0");
    bnull.setMargin(new Insets(2, 2, 2, 2));
    bnull.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bnull_ActionPerformed(evt);
      }
    });
    bnull.setBackground(Color.WHITE);
    cp.add(bnull);
    beins.setBounds(8, 168, 72, 32);
    beins.setFont(new Font("Dialog", Font.BOLD, 11));
    beins.setText("1");
    beins.setMargin(new Insets(2, 2, 2, 2));
    beins.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        beins_ActionPerformed(evt);
      }
    });
    beins.setBackground(Color.WHITE);
    cp.add(beins);
    bzwei.setBounds(80, 168, 72, 32);
    bzwei.setFont(new Font("Dialog", Font.BOLD, 11));
    bzwei.setText("2");
    bzwei.setMargin(new Insets(2, 2, 2, 2));
    bzwei.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bzwei_ActionPerformed(evt);
      }
    });
    bzwei.setBackground(Color.WHITE);
    cp.add(bzwei);
    bdrei.setBounds(152, 168, 72, 32);
    bdrei.setFont(new Font("Dialog", Font.BOLD, 11));
    bdrei.setText("3");
    bdrei.setMargin(new Insets(2, 2, 2, 2));
    bdrei.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bdrei_ActionPerformed(evt);
      }
    });
    bdrei.setBackground(Color.WHITE);
    cp.add(bdrei);
    bvier.setBounds(8, 136, 72, 32);
    bvier.setFont(new Font("Dialog", Font.BOLD, 11));
    bvier.setText("4");
    bvier.setMargin(new Insets(2, 2, 2, 2));
    bvier.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bvier_ActionPerformed(evt);
      }
    });
    bvier.setBackground(Color.WHITE);
    cp.add(bvier);
    bfuenf.setBounds(80, 136, 72, 32);
    bfuenf.setFont(new Font("Dialog", Font.BOLD, 11));
    bfuenf.setText("5");
    bfuenf.setMargin(new Insets(2, 2, 2, 2));
    bfuenf.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bfuenf_ActionPerformed(evt);
      }
    });
    bfuenf.setBackground(Color.WHITE);
    cp.add(bfuenf);
    bsechs.setBounds(152, 136, 72, 32);
    bsechs.setFont(new Font("Dialog", Font.BOLD, 11));
    bsechs.setText("6");
    bsechs.setMargin(new Insets(2, 2, 2, 2));
    bsechs.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bsechs_ActionPerformed(evt);
      }
    });
    bsechs.setBackground(Color.WHITE);
    cp.add(bsechs);
    bsieben.setBounds(8, 104, 72, 32);
    bsieben.setFont(new Font("Dialog", Font.BOLD, 11));
    bsieben.setText("7");
    bsieben.setMargin(new Insets(2, 2, 2, 2));
    bsieben.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bsieben_ActionPerformed(evt);
      }
    });
    bsieben.setBackground(Color.WHITE);
    cp.add(bsieben);
    bacht.setBounds(80, 104, 72, 32);
    bacht.setFont(new Font("Dialog", Font.BOLD, 11));
    bacht.setText("8");
    bacht.setMargin(new Insets(2, 2, 2, 2));
    bacht.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bacht_ActionPerformed(evt);
      }
    });
    bacht.setBackground(Color.WHITE);
    cp.add(bacht);
    bneun.setBounds(152, 104, 72, 32);
    bneun.setFont(new Font("Dialog", Font.BOLD, 11));
    bneun.setText("9");
    bneun.setMargin(new Insets(2, 2, 2, 2));
    bneun.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bneun_ActionPerformed(evt);
      }
    });
    bneun.setBackground(Color.WHITE);
    cp.add(bneun);
    bkomma.setBounds(152, 200, 72, 32);
    bkomma.setFont(new Font("Dialog", Font.BOLD, 11));
    bkomma.setText(".");
    bkomma.setMargin(new Insets(2, 2, 2, 2));
    bkomma.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bkomma_ActionPerformed(evt);
      }
    });
    bkomma.setBackground(Color.WHITE);
    cp.add(bkomma);
    bgleich.setBounds(224, 200, 72, 32);
    bgleich.setFont(new Font("Dialog", Font.BOLD, 11));
    bgleich.setText("=");
    bgleich.setMargin(new Insets(2, 2, 2, 2));
    bgleich.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bgleich_ActionPerformed(evt);
      }
    });
    bgleich.setBackground(Color.WHITE);
    cp.add(bgleich);
    bplus.setBounds(224, 168, 72, 32);
    bplus.setFont(new Font("Dialog", Font.BOLD, 11));
    bplus.setText("+");
    bplus.setMargin(new Insets(2, 2, 2, 2));
    bplus.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bplus_ActionPerformed(evt);
      }
    });
    bplus.setBackground(Color.WHITE);
    cp.add(bplus);
    bminus.setBounds(224, 136, 72, 32);
    bminus.setFont(new Font("Dialog", Font.BOLD, 11));
    bminus.setText("-");
    bminus.setMargin(new Insets(2, 2, 2, 2));
    bminus.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bminus_ActionPerformed(evt);
      }
    });
    bminus.setBackground(Color.WHITE);
    cp.add(bminus);
    bmal.setBounds(224, 104, 72, 32);
    bmal.setFont(new Font("Dialog", Font.BOLD, 11));
    bmal.setText("*");
    bmal.setMargin(new Insets(2, 2, 2, 2));
    bmal.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bmal_ActionPerformed(evt);
      }
    });
    bmal.setBackground(Color.WHITE);
    cp.add(bmal);
    bgeteilt.setBounds(224, 72, 72, 32);
    bgeteilt.setFont(new Font("Dialog", Font.BOLD, 11));
    bgeteilt.setText("/");
    bgeteilt.setMargin(new Insets(2, 2, 2, 2));
    bgeteilt.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bgeteilt_ActionPerformed(evt);
      }
    });
    bgeteilt.setBackground(Color.WHITE);
    cp.add(bgeteilt);
    bleeren.setBounds(8, 72, 72, 32);
    bleeren.setFont(new Font("Dialog", Font.BOLD, 11));
    bleeren.setText("AC");
    bleeren.setMargin(new Insets(2, 2, 2, 2));
    bleeren.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bleeren_ActionPerformed(evt);
      }
    });
    bleeren.setBackground(Color.WHITE);
    cp.add(bleeren);
    bnegativ.setBounds(80, 72, 72, 32);
    bnegativ.setFont(new Font("Dialog", Font.BOLD, 11));
    bnegativ.setText("+/-");
    bnegativ.setMargin(new Insets(2, 2, 2, 2));
    bnegativ.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bnegativ_ActionPerformed(evt);
      }
    });
    bnegativ.setBackground(Color.WHITE);
    cp.add(bnegativ);
    bprozent.setBounds(152, 72, 72, 32);
    bprozent.setFont(new Font("Dialog", Font.BOLD, 11));
    bprozent.setText("%");
    bprozent.setMargin(new Insets(2, 2, 2, 2));
    bprozent.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bprozent_ActionPerformed(evt);
      }
    });
    bprozent.setBackground(Color.WHITE);
    cp.add(bprozent);
    jtfeld.setBounds(8, 8, 290, 60);
    jtfeld.setFont(new Font("Dialog", Font.PLAIN, 11));
    jtfeld.setHorizontalAlignment(SwingConstants.RIGHT);
    jtfeld.setToolTipText("12+4");
    cp.add(jtfeld);
    // end components
    setVisible(true);
  } // end of public TaschenrechnerGUI
  // start methods
  public static void main(String[] args) {
    new TaschenrechnerGUI();
  } // end of main
  public void bnull_ActionPerformed(ActionEvent evt) {
    jtfeld.setText(jtfeld.getText() + "0");
  }
  public void beins_ActionPerformed(ActionEvent evt) {
    jtfeld.setText(jtfeld.getText() + "1");
  }
  public void bzwei_ActionPerformed(ActionEvent evt) {
    jtfeld.setText(jtfeld.getText() + "2");
  }
  public void bdrei_ActionPerformed(ActionEvent evt) {
    jtfeld.setText(jtfeld.getText() + "3");
  }
  public void bvier_ActionPerformed(ActionEvent evt) {
    jtfeld.setText(jtfeld.getText() + "4");
  }
  public void bfuenf_ActionPerformed(ActionEvent evt) {
    jtfeld.setText(jtfeld.getText() + "5");
  }
  public void bsechs_ActionPerformed(ActionEvent evt) {
    jtfeld.setText(jtfeld.getText() + "6");
  }
  public void bsieben_ActionPerformed(ActionEvent evt) {
    jtfeld.setText(jtfeld.getText() + "7");
  }
  public void bacht_ActionPerformed(ActionEvent evt) {
    jtfeld.setText(jtfeld.getText() + "8");
  }
  public void bneun_ActionPerformed(ActionEvent evt) {
    jtfeld.setText(jtfeld.getText() + "9");
  }
  public void bkomma_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    String input = jtfeld.getText().trim();
    String[] teilen = input.split("[.]");
    
    if (input.startsWith(".") || input.endsWith(".") || teilen.length >= 3) {
      JOptionPane.showMessageDialog(this, "Die Rechnung ist Falsch! ", "Fehler", JOptionPane.ERROR_MESSAGE);
    }else {
      jtfeld.setText(input + ".");
      bkomma.setEnabled(false);
    } // end of if-else
  } // end of bkomma_ActionPerformed
  public void bgleich_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    bkomma.setEnabled(true);
    bprozent.setEnabled(true);
    try {
      rechnen r = new rechnen(jtfeld.getText());
      r.rechner();
      String fehler = r.getFehler();
      if (!fehler.equals(".")) {
        JOptionPane.showMessageDialog(this, "" + fehler, "Fehler", JOptionPane.ERROR_MESSAGE);
        jtfeld.setText("");
        return;
      }
      double ergebnis = r.getErgebnis();
      jtfeld.setText(String.valueOf(ergebnis));
    } catch(Exception e) {
      JOptionPane.showMessageDialog(this, "Die Rechnung ist Falsch! ", "Fehler", JOptionPane.ERROR_MESSAGE);
    }
  } // end of bgleich_ActionPerformed
  public void bplus_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    if (jtfeld.getText().endsWith("+") || jtfeld.getText().endsWith("-") || jtfeld.getText().endsWith("*") || jtfeld.getText().endsWith("/")) {
      JOptionPane.showMessageDialog(this, "Die Rechnung ist Falsch! ", "Fehler", JOptionPane.ERROR_MESSAGE);
    } else {
      jtfeld.setText(jtfeld.getText() + "+");
      bkomma.setEnabled(true);
    } // end of if-else
  } // end of bplus_ActionPerformed
  public void bminus_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    if (jtfeld.getText().endsWith("+") || jtfeld.getText().endsWith("-") || jtfeld.getText().endsWith("*") || jtfeld.getText().endsWith("/")) {
      JOptionPane.showMessageDialog(this, "Die Rechnung ist Falsch! ", "Fehler", JOptionPane.ERROR_MESSAGE);
    } else {
      jtfeld.setText(jtfeld.getText() + "-");
      bkomma.setEnabled(true);
    } // end of if-else
  } // end of bminus_ActionPerformed

  public void bmal_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    if (jtfeld.getText().endsWith("+") || jtfeld.getText().endsWith("-") || jtfeld.getText().endsWith("*") || jtfeld.getText().endsWith("/")) {
      JOptionPane.showMessageDialog(this, "Die Rechnung ist Falsch! ", "Fehler", JOptionPane.ERROR_MESSAGE);
    } else {
      jtfeld.setText(jtfeld.getText() + "*");
      bkomma.setEnabled(true);
    } // end of if-else
  } // end of bmal_ActionPerformed

  public void bgeteilt_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    if (jtfeld.getText().endsWith("+") || jtfeld.getText().endsWith("-") || jtfeld.getText().endsWith("*") || jtfeld.getText().endsWith("/")) {
      JOptionPane.showMessageDialog(this, "Die Rechnung ist Falsch! ", "Fehler", JOptionPane.ERROR_MESSAGE);
    } else {
      jtfeld.setText(jtfeld.getText() + "/");
      bkomma.setEnabled(true);
    } // end of if-else
  } // end of bgeteilt_ActionPerformed

  public void bleeren_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    jtfeld.setText("");
    bkomma.setEnabled(true);
    bprozent.setEnabled(true);
  } // end of bleeren_ActionPerformed

  public void bnegativ_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    if (jtfeld.getText().startsWith("-")) {
      jtfeld.setText(jtfeld.getText().substring(1));
    }else {
      jtfeld.setText("-" + jtfeld.getText());
    } // end of if-else
  } // end of bnegativ_ActionPerformed

  public void bprozent_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    if (jtfeld.getText().contains("%")) {
      JOptionPane.showMessageDialog(this, "Die Rechnung ist Falsch! ", "Fehler", JOptionPane.ERROR_MESSAGE);
    }else {
      jtfeld.setText(jtfeld.getText() + "%");
      bprozent.setEnabled(false);
    }
  } // end of bprozent_ActionPerformed

  public void jOptionPane1_ShowDialog() {
    JOptionPane.showMessageDialog(this, "", "", JOptionPane.ERROR_MESSAGE);
  }
  // end methods
} // end of class TaschenrechnerGUI
