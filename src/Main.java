import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    private static final String[] odkazy = new String[10];

    private static final JFrame fr = new JFrame("Galerie");
    private static final JTextField odkaz = new JTextField("");

    private static JButton obrazek1 = new JButton("");
    private static JButton obrazek2 = new JButton("");
    private static JButton obrazek3 = new JButton("");
    private static JButton obrazek4 = new JButton("");
    private static JButton obrazek5 = new JButton("");
    private static JButton obrazek6 = new JButton("");
    private static JButton obrazek7 = new JButton("");
    private static JButton obrazek8 = new JButton("");
    private static JButton obrazek9 = new JButton("");
    private static JButton obrazek0 = new JButton("");
    private static final JButton velkyObrazek1 = new JButton("");
    private static final JButton velkyObrazek2 = new JButton("");
    private static final JButton aktualizace = new JButton("Aktualizace");
    private static int vybrane;

    public static void main(String[] args) {
        odkazy[0] = "/Users/user779/Downloads/BVP.jpg";
        odkazy[1] = "/Users/user779/Downloads/F35.jpg";
        odkazy[2] = "/Users/user779/Downloads/Tornado.jpg";
        odkazy[3] = "/Users/user779/Downloads/Puma.jpg";
        odkazy[4] = "/Users/user779/Downloads/Raven.jpg";
        odkazy[5] = "/Users/user779/Downloads/Abrams.jpg";
        odkazy[6] = "/Users/user779/Downloads/Leo.jpg";
        odkazy[7] = "/Users/user779/Downloads/T72.jpg";
        odkazy[8] = "/Users/user779/Downloads/Reaper.jpg";
        odkazy[9] = "";

        fr.setBounds(200,100,1110,750);
        fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fr.setLayout(null);
        fr.getContentPane().setBackground(Color.gray);
        fr.setVisible(true);
        fr.setResizable(false);

        Icon icon1 = new ImageIcon(odkazy[0]);

        obrazek1 = new JButton(icon1);
        obrazek1.setBounds(10, 10, 100, 75);
        obrazek1.setVisible(true);
        obrazek1.addActionListener(Main::Prvy);
        fr.add(obrazek1);

        Icon icon2 = new ImageIcon(odkazy[1]);

        obrazek2 = new JButton(icon2);
        obrazek2.setBounds(120, 10, 100, 75);
        obrazek2.setVisible(true);
        obrazek2.addActionListener(Main::Druhy);
        fr.add(obrazek2);

        Icon icon3 = new ImageIcon(odkazy[2]);

        obrazek3 = new JButton(icon3);
        obrazek3.setBounds(230, 10, 100, 75);
        obrazek3.setVisible(true);
        obrazek3.addActionListener(Main::Treti);
        fr.add(obrazek3);

        Icon icon4 = new ImageIcon(odkazy[3]);

        obrazek4 = new JButton(icon4);
        obrazek4.setBounds(340, 10, 100, 75);
        obrazek4.setVisible(true);
        obrazek4.addActionListener(Main::Ctvrty);
        fr.add(obrazek4);

        Icon icon5 = new ImageIcon(odkazy[4]);

        obrazek5 = new JButton(icon5);
        obrazek5.setBounds(450, 10, 100, 75);
        obrazek5.setVisible(true);
        obrazek5.addActionListener(Main::Paty);
        fr.add(obrazek5);

        Icon icon6 = new ImageIcon(odkazy[5]);

        obrazek6 = new JButton(icon6);
        obrazek6.setBounds(560, 10, 100, 75);
        obrazek6.setVisible(true);
        obrazek6.addActionListener(Main::Sesty);
        fr.add(obrazek6);

        Icon icon7 = new ImageIcon(odkazy[6]);

        obrazek7 = new JButton(icon7);
        obrazek7.setBounds(670, 10, 100, 75);
        obrazek7.setVisible(true);
        obrazek7.addActionListener(Main::Sedmi);
        fr.add(obrazek7);

        Icon icon8 = new ImageIcon(odkazy[7]);

        obrazek8 = new JButton(icon8);
        obrazek8.setBounds(780, 10, 100, 75);
        obrazek8.setVisible(true);
        obrazek8.addActionListener(Main::Osmy);
        fr.add(obrazek8);

        Icon icon9 = new ImageIcon(odkazy[8]);

        obrazek9 = new JButton(icon9);
        obrazek9.setBounds(890, 10, 100, 75);
        obrazek9.setVisible(true);
        obrazek9.addActionListener(Main::Devaty);
        fr.add(obrazek9);

        Icon icon0 = new ImageIcon(odkazy[9]);

        obrazek0 = new JButton(icon0);
        obrazek0.setBounds(1000, 10, 100, 75);
        obrazek0.setVisible(true);
        obrazek0.addActionListener(Main::Desaty);
        fr.add(obrazek0);

        aktualizace.setBounds(1000, 110, 100, 25);
        aktualizace.setVisible(true);
        aktualizace.addActionListener(Main::Update);
        fr.add(aktualizace);

        odkaz.setBounds(10, 110, 880,25);
        odkaz.setVisible(true);
        fr.add(odkaz);

        velkyObrazek1.setBounds(150, 140, 800,600);
        velkyObrazek1.setVisible(false);
        fr.add(velkyObrazek1);

        velkyObrazek2.setBounds(150, 140, 800,450);
        velkyObrazek2.setVisible(false);
        fr.add(velkyObrazek2);

        fr.update(fr.getGraphics());
    }

    public static void Prvy(ActionEvent e) {
        vybrane = 1;
        nastavitOdkaz();
    }

    public static void Druhy(ActionEvent e) {
        vybrane = 2;
        nastavitOdkaz();
    }

    public static void Treti(ActionEvent e) {
        vybrane = 3;
        nastavitOdkaz();
    }

    public static void Ctvrty(ActionEvent e) {
        vybrane = 4;
        nastavitOdkaz();
    }

    public static void Paty(ActionEvent e) {
        vybrane = 5;
        nastavitOdkaz();
    }

    public static void Sesty(ActionEvent e) {
        vybrane = 6;
        nastavitOdkaz();
    }

    public static void Sedmi(ActionEvent e) {
        vybrane = 7;
        nastavitOdkaz();
    }

    public static void Osmy(ActionEvent e) {
        vybrane = 8;
        nastavitOdkaz();
    }

    public static void Devaty(ActionEvent e) {
        vybrane = 9;
        nastavitOdkaz();
    }
    public static void Desaty(ActionEvent e) {
        vybrane = 10;
        nastavitOdkaz();
    }
    public static void Update(ActionEvent e) {
        if(vybrane == 1){
            String pomocna = odkaz.getText();
            odkazy[vybrane -1] = pomocna;
            Icon icona = new ImageIcon(odkazy[vybrane - 1]);
            obrazek1.setIcon(icona);
            obrazek1.setVisible(true);
            odkaz.setText(odkazy[vybrane - 1]);
            BufferedImage image;
            try {
                image = ImageIO.read(new File(odkazy[vybrane - 1]));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            if ((image.getWidth() / image.getHeight()) == (4 / 3)){
                Image vlozit = image.getScaledInstance(800, 600, Image.SCALE_DEFAULT);
                velkyObrazek1.setIcon(new ImageIcon(vlozit));
                velkyObrazek1.setVisible(true);
                velkyObrazek2.setVisible(false);
                fr.add(velkyObrazek1);
                fr.add(velkyObrazek2);
            }
            else if ((image.getWidth() / image.getHeight()) == (16 / 9)){
                Image vlozit = image.getScaledInstance(800, 450, Image.SCALE_DEFAULT);
                velkyObrazek2.setIcon(new ImageIcon(vlozit));
                velkyObrazek2.setVisible(true);
                velkyObrazek1.setVisible(false);
                fr.add(velkyObrazek1);
                fr.add(velkyObrazek2);
            }
            else{
                Image vlozit = image.getScaledInstance(800, 600, Image.SCALE_DEFAULT);
                velkyObrazek1.setIcon(new ImageIcon(vlozit));
                velkyObrazek1.setVisible(true);
                velkyObrazek2.setVisible(false);
                fr.add(velkyObrazek1);
                fr.add(velkyObrazek2);
            }
        }
        else if(vybrane == 2){
            String pomocna = odkaz.getText();
            odkazy[vybrane -1] = pomocna;
            Icon icona = new ImageIcon(odkazy[vybrane - 1]);
            obrazek2.setIcon(icona);
            obrazek2.setVisible(true);
            odkaz.setText(odkazy[vybrane - 1]);
            BufferedImage image;
            try {
                image = ImageIO.read(new File(odkazy[vybrane - 1]));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            if ((image.getWidth() / image.getHeight()) == (4 / 3)){
                Image vlozit = image.getScaledInstance(800, 600, Image.SCALE_DEFAULT);
                velkyObrazek1.setIcon(new ImageIcon(vlozit));
                velkyObrazek1.setVisible(true);
                velkyObrazek2.setVisible(false);
                fr.add(velkyObrazek1);
                fr.add(velkyObrazek2);
            }
            else if ((image.getWidth() / image.getHeight()) == (16 / 9)){
                Image vlozit = image.getScaledInstance(800, 450, Image.SCALE_DEFAULT);
                velkyObrazek2.setIcon(new ImageIcon(vlozit));
                velkyObrazek2.setVisible(true);
                velkyObrazek1.setVisible(false);
                fr.add(velkyObrazek1);
                fr.add(velkyObrazek2);
            }
            else{
                Image vlozit = image.getScaledInstance(800, 600, Image.SCALE_DEFAULT);
                velkyObrazek1.setIcon(new ImageIcon(vlozit));
                velkyObrazek1.setVisible(true);
                velkyObrazek2.setVisible(false);
                fr.add(velkyObrazek1);
                fr.add(velkyObrazek2);
            }
        }
        else if(vybrane == 3){
            String pomocna = odkaz.getText();
            odkazy[vybrane -1] = pomocna;
            Icon icona = new ImageIcon(odkazy[vybrane - 1]);
            obrazek3.setIcon(icona);
            obrazek3.setVisible(true);
            odkaz.setText(odkazy[vybrane - 1]);
            BufferedImage image;
            try {
                image = ImageIO.read(new File(odkazy[vybrane - 1]));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            if ((image.getWidth() / image.getHeight()) == (4 / 3)){
                Image vlozit = image.getScaledInstance(800, 600, Image.SCALE_DEFAULT);
                velkyObrazek1.setIcon(new ImageIcon(vlozit));
                velkyObrazek1.setVisible(true);
                velkyObrazek2.setVisible(false);
                fr.add(velkyObrazek1);
                fr.add(velkyObrazek2);
            }
            else if ((image.getWidth() / image.getHeight()) == (16 / 9)){
                Image vlozit = image.getScaledInstance(800, 450, Image.SCALE_DEFAULT);
                velkyObrazek2.setIcon(new ImageIcon(vlozit));
                velkyObrazek2.setVisible(true);
                velkyObrazek1.setVisible(false);
                fr.add(velkyObrazek1);
                fr.add(velkyObrazek2);
            }
            else{
                Image vlozit = image.getScaledInstance(800, 600, Image.SCALE_DEFAULT);
                velkyObrazek1.setIcon(new ImageIcon(vlozit));
                velkyObrazek1.setVisible(true);
                velkyObrazek2.setVisible(false);
                fr.add(velkyObrazek1);
                fr.add(velkyObrazek2);
            }
        }
        else if(vybrane == 4){
            String pomocna = odkaz.getText();
            odkazy[vybrane -1] = pomocna;
            Icon icona = new ImageIcon(odkazy[vybrane - 1]);
            obrazek4.setIcon(icona);
            obrazek4.setVisible(true);
            odkaz.setText(odkazy[vybrane - 1]);
            BufferedImage image;
            try {
                image = ImageIO.read(new File(odkazy[vybrane - 1]));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            if ((image.getWidth() / image.getHeight()) == (4 / 3)){
                Image vlozit = image.getScaledInstance(800, 600, Image.SCALE_DEFAULT);
                velkyObrazek1.setIcon(new ImageIcon(vlozit));
                velkyObrazek1.setVisible(true);
                velkyObrazek2.setVisible(false);
                fr.add(velkyObrazek1);
                fr.add(velkyObrazek2);
            }
            else if ((image.getWidth() / image.getHeight()) == (16 / 9)){
                Image vlozit = image.getScaledInstance(800, 450, Image.SCALE_DEFAULT);
                velkyObrazek2.setIcon(new ImageIcon(vlozit));
                velkyObrazek2.setVisible(true);
                velkyObrazek1.setVisible(false);
                fr.add(velkyObrazek1);
                fr.add(velkyObrazek2);
            }
            else{
                Image vlozit = image.getScaledInstance(800, 600, Image.SCALE_DEFAULT);
                velkyObrazek1.setIcon(new ImageIcon(vlozit));
                velkyObrazek1.setVisible(true);
                velkyObrazek2.setVisible(false);
                fr.add(velkyObrazek1);
                fr.add(velkyObrazek2);
            }
        }
        else if(vybrane == 5){
            String pomocna = odkaz.getText();
            odkazy[vybrane -1] = pomocna;
            Icon icona = new ImageIcon(odkazy[vybrane - 1]);
            obrazek5.setIcon(icona);
            obrazek5.setVisible(true);
            odkaz.setText(odkazy[vybrane - 1]);
            BufferedImage image;
            try {
                image = ImageIO.read(new File(odkazy[vybrane - 1]));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            if ((image.getWidth() / image.getHeight()) == (4 / 3)){
                Image vlozit = image.getScaledInstance(800, 600, Image.SCALE_DEFAULT);
                velkyObrazek1.setIcon(new ImageIcon(vlozit));
                velkyObrazek1.setVisible(true);
                velkyObrazek2.setVisible(false);
                fr.add(velkyObrazek1);
                fr.add(velkyObrazek2);
            }
            else if ((image.getWidth() / image.getHeight()) == (16 / 9)){
                Image vlozit = image.getScaledInstance(800, 450, Image.SCALE_DEFAULT);
                velkyObrazek2.setIcon(new ImageIcon(vlozit));
                velkyObrazek2.setVisible(true);
                velkyObrazek1.setVisible(false);
                fr.add(velkyObrazek1);
                fr.add(velkyObrazek2);
            }
            else{
                Image vlozit = image.getScaledInstance(800, 600, Image.SCALE_DEFAULT);
                velkyObrazek1.setIcon(new ImageIcon(vlozit));
                velkyObrazek1.setVisible(true);
                velkyObrazek2.setVisible(false);
                fr.add(velkyObrazek1);
                fr.add(velkyObrazek2);
            }
        }
        else if(vybrane == 6){
            String pomocna = odkaz.getText();
            odkazy[vybrane -1] = pomocna;
            Icon icona = new ImageIcon(odkazy[vybrane - 1]);
            obrazek6.setIcon(icona);
            obrazek6.setVisible(true);
            odkaz.setText(odkazy[vybrane - 1]);
            BufferedImage image;
            try {
                image = ImageIO.read(new File(odkazy[vybrane - 1]));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            if ((image.getWidth() / image.getHeight()) == (4 / 3)){
                Image vlozit = image.getScaledInstance(800, 600, Image.SCALE_DEFAULT);
                velkyObrazek1.setIcon(new ImageIcon(vlozit));
                velkyObrazek1.setVisible(true);
                velkyObrazek2.setVisible(false);
                fr.add(velkyObrazek1);
                fr.add(velkyObrazek2);
            }
            else if ((image.getWidth() / image.getHeight()) == (16 / 9)){
                Image vlozit = image.getScaledInstance(800, 450, Image.SCALE_DEFAULT);
                velkyObrazek2.setIcon(new ImageIcon(vlozit));
                velkyObrazek2.setVisible(true);
                velkyObrazek1.setVisible(false);
                fr.add(velkyObrazek1);
                fr.add(velkyObrazek2);
            }
            else{
                Image vlozit = image.getScaledInstance(800, 600, Image.SCALE_DEFAULT);
                velkyObrazek1.setIcon(new ImageIcon(vlozit));
                velkyObrazek1.setVisible(true);
                velkyObrazek2.setVisible(false);
                fr.add(velkyObrazek1);
                fr.add(velkyObrazek2);
            }
        }
        else if(vybrane == 7){
            String pomocna = odkaz.getText();
            odkazy[vybrane -1] = pomocna;
            Icon icona = new ImageIcon(odkazy[vybrane - 1]);
            obrazek7.setIcon(icona);
            obrazek7.setVisible(true);
            odkaz.setText(odkazy[vybrane - 1]);
            BufferedImage image;
            try {
                image = ImageIO.read(new File(odkazy[vybrane - 1]));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            if ((image.getWidth() / image.getHeight()) == (4 / 3)){
                Image vlozit = image.getScaledInstance(800, 600, Image.SCALE_DEFAULT);
                velkyObrazek1.setIcon(new ImageIcon(vlozit));
                velkyObrazek1.setVisible(true);
                velkyObrazek2.setVisible(false);
                fr.add(velkyObrazek1);
                fr.add(velkyObrazek2);
            }
            else if ((image.getWidth() / image.getHeight()) == (16 / 9)){
                Image vlozit = image.getScaledInstance(800, 450, Image.SCALE_DEFAULT);
                velkyObrazek2.setIcon(new ImageIcon(vlozit));
                velkyObrazek2.setVisible(true);
                velkyObrazek1.setVisible(false);
                fr.add(velkyObrazek1);
                fr.add(velkyObrazek2);
            }
            else{
                Image vlozit = image.getScaledInstance(800, 600, Image.SCALE_DEFAULT);
                velkyObrazek1.setIcon(new ImageIcon(vlozit));
                velkyObrazek1.setVisible(true);
                velkyObrazek2.setVisible(false);
                fr.add(velkyObrazek1);
                fr.add(velkyObrazek2);
            }
        }
        else if(vybrane == 8){
            String pomocna = odkaz.getText();
            odkazy[vybrane -1] = pomocna;
            Icon icona = new ImageIcon(odkazy[vybrane - 1]);
            obrazek8.setIcon(icona);
            obrazek8.setVisible(true);
            odkaz.setText(odkazy[vybrane - 1]);
            BufferedImage image;
            try {
                image = ImageIO.read(new File(odkazy[vybrane - 1]));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            if ((image.getWidth() / image.getHeight()) == (4 / 3)){
                Image vlozit = image.getScaledInstance(800, 600, Image.SCALE_DEFAULT);
                velkyObrazek1.setIcon(new ImageIcon(vlozit));
                velkyObrazek1.setVisible(true);
                velkyObrazek2.setVisible(false);
                fr.add(velkyObrazek1);
                fr.add(velkyObrazek2);
            }
            else if ((image.getWidth() / image.getHeight()) == (16 / 9)){
                Image vlozit = image.getScaledInstance(800, 450, Image.SCALE_DEFAULT);
                velkyObrazek2.setIcon(new ImageIcon(vlozit));
                velkyObrazek2.setVisible(true);
                velkyObrazek1.setVisible(false);
                fr.add(velkyObrazek1);
                fr.add(velkyObrazek2);
            }
            else{
                Image vlozit = image.getScaledInstance(800, 600, Image.SCALE_DEFAULT);
                velkyObrazek1.setIcon(new ImageIcon(vlozit));
                velkyObrazek1.setVisible(true);
                velkyObrazek2.setVisible(false);
                fr.add(velkyObrazek1);
                fr.add(velkyObrazek2);
            }
        }
        else if(vybrane == 9){
            String pomocna = odkaz.getText();
            odkazy[vybrane -1] = pomocna;
            Icon icona = new ImageIcon(odkazy[vybrane - 1]);
            obrazek9.setIcon(icona);
            obrazek9.setVisible(true);
            odkaz.setText(odkazy[vybrane - 1]);
            BufferedImage image;
            try {
                image = ImageIO.read(new File(odkazy[vybrane - 1]));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            if ((image.getWidth() / image.getHeight()) == (4 / 3)){
                Image vlozit = image.getScaledInstance(800, 600, Image.SCALE_DEFAULT);
                velkyObrazek1.setIcon(new ImageIcon(vlozit));
                velkyObrazek1.setVisible(true);
                velkyObrazek2.setVisible(false);
                fr.add(velkyObrazek1);
                fr.add(velkyObrazek2);
            }
            else if ((image.getWidth() / image.getHeight()) == (16 / 9)){
                Image vlozit = image.getScaledInstance(800, 450, Image.SCALE_DEFAULT);
                velkyObrazek2.setIcon(new ImageIcon(vlozit));
                velkyObrazek2.setVisible(true);
                velkyObrazek1.setVisible(false);
                fr.add(velkyObrazek1);
                fr.add(velkyObrazek2);
            }
            else{
                Image vlozit = image.getScaledInstance(800, 600, Image.SCALE_DEFAULT);
                velkyObrazek1.setIcon(new ImageIcon(vlozit));
                velkyObrazek1.setVisible(true);
                velkyObrazek2.setVisible(false);
                fr.add(velkyObrazek1);
                fr.add(velkyObrazek2);
            }
        }
        else if(vybrane == 10){
            String pomocna = odkaz.getText();
            odkazy[vybrane -1] = pomocna;
            Icon icona = new ImageIcon(odkazy[vybrane - 1]);
            obrazek0.setIcon(icona);
            obrazek0.setVisible(true);
            odkaz.setText(odkazy[vybrane - 1]);
            BufferedImage image;
            try {
                image = ImageIO.read(new File(odkazy[vybrane - 1]));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            if ((image.getWidth() / image.getHeight()) == (4 / 3)){
                Image vlozit = image.getScaledInstance(800, 600, Image.SCALE_DEFAULT);
                velkyObrazek1.setIcon(new ImageIcon(vlozit));
                velkyObrazek1.setVisible(true);
                velkyObrazek2.setVisible(false);
                fr.add(velkyObrazek1);
                fr.add(velkyObrazek2);
            }
            else if ((image.getWidth() / image.getHeight()) == (16 / 9)){
                Image vlozit = image.getScaledInstance(800, 450, Image.SCALE_DEFAULT);
                velkyObrazek2.setIcon(new ImageIcon(vlozit));
                velkyObrazek2.setVisible(true);
                velkyObrazek1.setVisible(false);
                fr.add(velkyObrazek1);
                fr.add(velkyObrazek2);
            }
            else{
                Image vlozit = image.getScaledInstance(800, 600, Image.SCALE_DEFAULT);
                velkyObrazek1.setIcon(new ImageIcon(vlozit));
                velkyObrazek1.setVisible(true);
                velkyObrazek2.setVisible(false);
                fr.add(velkyObrazek1);
                fr.add(velkyObrazek2);
            }
        }
    }

    private static void nastavitOdkaz() {
        odkaz.setText(odkazy[vybrane - 1]);
        BufferedImage image;
        try {
            image = ImageIO.read(new File(odkazy[vybrane - 1]));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        if ((image.getWidth() / image.getHeight()) == (4 / 3)){
            Image vlozit = image.getScaledInstance(800, 600, Image.SCALE_DEFAULT);
            velkyObrazek1.setIcon(new ImageIcon(vlozit));
            velkyObrazek1.setVisible(true);
            velkyObrazek2.setVisible(false);
            fr.add(velkyObrazek1);
            fr.add(velkyObrazek2);
        }
        else if ((image.getWidth() / image.getHeight()) == (16 / 9)){
            Image vlozit = image.getScaledInstance(800, 450, Image.SCALE_DEFAULT);
            velkyObrazek2.setIcon(new ImageIcon(vlozit));
            velkyObrazek2.setVisible(true);
            velkyObrazek1.setVisible(false);
            fr.add(velkyObrazek1);
            fr.add(velkyObrazek2);
        }
        else{
            Image vlozit = image.getScaledInstance(800, 600, Image.SCALE_DEFAULT);
            velkyObrazek1.setIcon(new ImageIcon(vlozit));
            velkyObrazek1.setVisible(true);
            velkyObrazek2.setVisible(false);
            fr.add(velkyObrazek1);
            fr.add(velkyObrazek2);
        }
        fr.update(fr.getGraphics());
    }
}
