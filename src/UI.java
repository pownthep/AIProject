// <editor-fold defaultstate="collapsed" desc="Imports">
import OtsuThresholder.OtsuThresholder;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferByte;
import java.awt.image.Raster;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;
import net.sourceforge.tess4j.*;
// </editor-fold>

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author v-royhar
 */
public class UI extends javax.swing.JFrame {
    // Browser
    public final JFileChooser fc = new JFileChooser();
    public static BufferedImage resizedImage;
    public static String rename, line, mode;
    public static File[] input;
    public static String[] output;
    /**
     * Creates new form MainFrame
     */
    public UI() {
        JTextField newTitle = new JTextField("PPAP Project");
        this.setTitle(newTitle.getText());
        initComponents();
        //this.tabbedPane.setForeground(Color.white);
        fc.setMultiSelectionEnabled(true);
        ocrImageUriTextBox.setEditable(false);
        jComboBox1.setSelectedItem("Number only");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPane = new javax.swing.JTabbedPane();
        ocrPanel = new javax.swing.JPanel();
        ocrTitleLabel = new javax.swing.JLabel();
        ocrInstructionLabel = new javax.swing.JLabel();
        ocrImagePromptLabel = new javax.swing.JLabel();
        ocrImageUriTextBox = new javax.swing.JTextField();
        ocrResponseLabel = new javax.swing.JLabel();
        ocrSourceImageLabel = new javax.swing.JLabel();
        ocrScrollPane = new javax.swing.JScrollPane();
        ocrResponseTextArea = new javax.swing.JTextArea();
        ocrImage = new javax.swing.JLabel();
        Browse = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        ocrImagePromptLabel1 = new javax.swing.JLabel();
        Browse1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        setMinimumSize(new java.awt.Dimension(960, 600));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);

        ocrTitleLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ocrTitleLabel.setText("License Plate Recognition");

        ocrImagePromptLabel.setText("Directory:");

        ocrResponseLabel.setText("Response:");

        ocrSourceImageLabel.setText("Source image:");

        ocrResponseTextArea.setEditable(false);
        ocrResponseTextArea.setColumns(20);
        ocrResponseTextArea.setRows(5);
        ocrScrollPane.setViewportView(ocrResponseTextArea);

        ocrImage.setBackground(new java.awt.Color(0, 0, 0));

        Browse.setText("Browse");
        Browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Number only", "Character & Number" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        ocrImagePromptLabel1.setText("Mode:");

        Browse1.setText("Run");
        Browse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Browse1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ocrPanelLayout = new javax.swing.GroupLayout(ocrPanel);
        ocrPanel.setLayout(ocrPanelLayout);
        ocrPanelLayout.setHorizontalGroup(
            ocrPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ocrPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ocrPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ocrPanelLayout.createSequentialGroup()
                        .addGroup(ocrPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ocrScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ocrResponseLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ocrPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ocrPanelLayout.createSequentialGroup()
                                .addComponent(ocrSourceImageLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 447, Short.MAX_VALUE))
                            .addComponent(ocrImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(ocrPanelLayout.createSequentialGroup()
                        .addGroup(ocrPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ocrTitleLabel)
                            .addComponent(ocrInstructionLabel)
                            .addGroup(ocrPanelLayout.createSequentialGroup()
                                .addComponent(ocrImagePromptLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ocrImageUriTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Browse)
                                .addGap(7, 7, 7)
                                .addComponent(ocrImagePromptLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Browse1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ocrPanelLayout.setVerticalGroup(
            ocrPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ocrPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ocrTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ocrInstructionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ocrPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ocrImagePromptLabel)
                    .addComponent(ocrImageUriTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Browse)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ocrImagePromptLabel1)
                    .addComponent(Browse1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ocrPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ocrResponseLabel)
                    .addComponent(ocrSourceImageLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ocrPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ocrImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ocrScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE))
                .addContainerGap())
        );

        ocrTitleLabel.getAccessibleContext().setAccessibleName("License Plate Recognition by Optical Character Recognition (OCR)");

        tabbedPane.addTab("License Plate Recognition ", ocrPanel);
        ocrPanel.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPane)
                .addGap(10, 10, 10))
        );

        getAccessibleContext().setAccessibleName("AI Project: Thai License Plate Recognition");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseActionPerformed
        fc.showOpenDialog(this);
        input = fc.getSelectedFiles();
    }//GEN-LAST:event_BrowseActionPerformed
    //Choose OCR mode
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        mode = (String)jComboBox1.getSelectedItem();
        System.out.println("Mode: " + mode);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void Browse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Browse1ActionPerformed
        // TODO add your handling code here:
        runOCR();
    }//GEN-LAST:event_Browse1ActionPerformed
    
    private void runOCR() {
        output = new String[input.length];
        try {
            // Open an input stream
            ocrResponseTextArea.setText("");
            int count = 0;
            String expectedOutput;
            for(int i = 0; i<input.length; i++){
                if(i==0) 
                    ocrResponseTextArea.append("-------------- Start --------------\n\n");
                BufferedImage bImage = ImageIO.read(input[i]);
                System.out.println("File: " + input[i].getName() + " loading.........");
                expectedOutput = input[i].getName().toUpperCase().replace(".JPG","");
                ocrImageUriTextBox.setText(input[i].getParent());
                 
                adjustImage(bImage);
                if(rename.equals(expectedOutput)) {
                    count = count + 1;
                    output[i] = rename;
                }
                    
                if(i==input.length-1){
                    resizedImage = null;
                    ocrResponseTextArea.append("\n-------------- Finish --------------\n");
                    ocrResponseTextArea.append("Total output: " + (i+1) + "\n");
                    ocrResponseTextArea.append("Accuracy: " + (count * 100.0)/((i+1)*1.0)+ "%\n" + "Count: " + count +"\n" + Arrays.toString(output));
                }
            }   
        } catch(IOException e) {
            ocrResponseTextArea.setText("Error loading OCR image: " + e.getMessage());
            return;
        }
    }
    /**
     * Scales the given image to fit the label dimensions.
     * @param bImage: The image to fit.
     * @param label: The label to display the image.
     */
    private void scaleAndShowImage(BufferedImage bImage, JLabel label) {
        int bImageHeight = bImage.getHeight();
        int bImageWidth = bImage.getWidth();
        int labelHeight = label.getHeight();
        int labelWidth = label.getWidth();
        
        // Does this need to be scaled?
        if (labelHeight >= bImageHeight && labelWidth >= bImageWidth) {
            // If not, display the image and return.
            ImageIcon image = new ImageIcon(bImage);
            label.setIcon(image);
            return;
        }
        
        // Calculate the new width and height for the image.
        int newHeight;
        int newWidth;
        double bImageAspect = (double)bImageHeight / (double)bImageWidth;
        double labelAspect = (double)labelHeight / (double)labelWidth;
        
        if (bImageAspect > labelAspect) {
            newHeight = labelHeight;
            newWidth = (int)(((double)labelHeight / (double)bImageHeight) * (double)bImageWidth);
        }else{
            newWidth = labelWidth;
            newHeight = (int)(((double)labelWidth / (double)bImageWidth) * (double)bImageHeight);
        }
        
        // Create a new image scaled to the correct size.
        Image newImage = bImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        
        // Display the scaled image.
        ImageIcon labelImage = new ImageIcon(newImage);
        label.setIcon(labelImage);
        label.validate();
        label.repaint();
    }
    //Create file with rename
    private String savePicture(BufferedImage bImage, String name) throws IOException{
        try {
            System.out.println("Change: " + rename + name);
            System.out.println("Length: " + rename.length());
            //check character of rename
            for(int i = 0; i<rename.length(); i++){
                System.out.println("char " + (i+1) + ": " + rename.charAt(i));
            }
            File outputfile = new File("output/" + rename + name);
            ImageIO.write(bImage, "jpg", outputfile);
            ocrResponseTextArea.append("Rename: " + rename + name + "\n");
            System.out.println("Output: " + outputfile.getCanonicalFile());
            File check = new File("output/" + (rename + name));
            if(check.canRead()==true){
               return check.getCanonicalPath(); 
            }else{
                return "ERROR";
            }  
        } catch(IOException e) {
            ocrResponseTextArea.setText("Error loading OCR image: " + e.getMessage());
            return "ERROR";
        }
    }
    //AdjustPicture for analyse
    private void adjustImage(BufferedImage bImage){
        //Resize picture
        int w = 544; int h = 408;
        //grayscale
        for(int i=0; i<bImage.getHeight(); i++){
            for(int j=0; j<bImage.getWidth(); j++){
                Color c = new Color(bImage.getRGB(j, i));
                double red = (c.getRed() * 0.299);
                double green = (c.getGreen() * 0.587);
                double blue = (c.getBlue() * 0.114);
                int rgb =(int) (red+green+blue);
                Color newColor = new Color(rgb,rgb,rgb);
                bImage.setRGB(j,i,newColor.getRGB());
            }
        }
        //get threshold
        Raster raster = bImage.getData();
        DataBuffer buffer = raster.getDataBuffer();
        DataBufferByte byteBuffer = (DataBufferByte) buffer;
        byte[] srcData = byteBuffer.getData(0);
        byte[] dstData = new byte[srcData.length];
        OtsuThresholder thresholder = new OtsuThresholder();
        int threshold = thresholder.doThreshold(srcData, dstData);
        
        //resize image
        resizedImage = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = resizedImage.createGraphics();
        g2d.drawImage(bImage, 0, 0, w, h, null);
        g2d.dispose();
        //Cropped Image
        //BufferedImage croppedImage = resizedImage.getSubimage(210, 0, 334, 270);
        int width = resizedImage.getWidth();
        int height = resizedImage.getHeight();
        
        //black and white
        for(int i=0; i<height; i++){
           for(int j=0; j<width; j++){
                Color c = new Color(resizedImage.getRGB(j, i));
                if(c.getRed()<=threshold&&c.getGreen()<=threshold&&c.getBlue()<=threshold){
                    int red = 0; 
                    int green = 0;
                    int blue = 0;
                    int rgb =(int) (red+green+blue);
                    Color newColor = new Color(rgb,rgb,rgb);
                    resizedImage.setRGB(j,i,newColor.getRGB());
                }else{
                    int red = 85; 
                    int green = 85;
                    int blue = 85;
                    int rgb =(int) (red+green+blue);
                    Color newColor = new Color(rgb,rgb,rgb);
                    resizedImage.setRGB(j,i,newColor.getRGB());
                    }    
                }
        }
        tesseract(resizedImage);
        scaleAndShowImage(resizedImage, ocrImage);
    }
    // OCR Tesseract 
    public String tesseract(BufferedImage imageFile){
        Tesseract instance = new Tesseract();
        switch(mode){
            case "Character & Number" : instance.setLanguage("tha"); break;
            case "Number only" : instance.setLanguage("tha"); break;   
        }
        try {
            String result = instance.doOCR(imageFile);
            createName(result);
            ocrResponseTextArea.append("LicensePlate: " + rename + "\n");
            return rename;
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
            return e.getMessage();
        }
    }
    //Select Character for rename 
    public String createName(String read){
        String tmp = read.trim();
        char[] select = new char[7];
        boolean chk = false;
        for(int i = 0, j = 0; i<tmp.length(); i++){
            if((tmp.charAt(i)>=0x0E01 && tmp.charAt(i)<=0x0E2E) ||
                (tmp.charAt(i) >= 0x0030 && tmp.charAt(i)<=0x0039)){
//                System.out.println("char " + i + ": " + tmp.charAt(i));
                chk = false;
                if(j<7){
                    if(mode.equals("Character & Number")){
                        if(chk == false && j>=0&&j<=2){
    //                        System.out.println("*char " + j + ": " + tmp.charAt(i));
                            select[j] = tmp.charAt(i);
                            j++;
                            chk = true;
                        }
                        if(chk == false && j>2 &&(tmp.charAt(i) >= 0x0030 && tmp.charAt(i)<=0x0039)){
    //                        System.out.println("*char " + j + ": " + tmp.charAt(i));
                            select[j] = tmp.charAt(i);
                            j++;
                            chk = true;
                        }
                    }
                    if(mode.equals("Number only")){
                        if(chk == false &&(tmp.charAt(i) >= 0x0030 && tmp.charAt(i)<=0x0039)){
    //                        System.out.println("*char " + j + ": " + tmp.charAt(i));
                            select[j] = tmp.charAt(i);
                            j++;
                            chk = true;
                        }
                    }
                }
            }       
        }
        String trim = String.copyValueOf(select);
        rename = trim.trim();
//        System.out.println("Filename: " + rename);
        return rename;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }
    

    // <editor-fold defaultstate="collapsed" desc="Variables declaration">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Browse;
    private javax.swing.JButton Browse1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel ocrImage;
    private javax.swing.JLabel ocrImagePromptLabel;
    private javax.swing.JLabel ocrImagePromptLabel1;
    private javax.swing.JTextField ocrImageUriTextBox;
    private javax.swing.JLabel ocrInstructionLabel;
    private javax.swing.JPanel ocrPanel;
    private javax.swing.JLabel ocrResponseLabel;
    private javax.swing.JTextArea ocrResponseTextArea;
    private javax.swing.JScrollPane ocrScrollPane;
    private javax.swing.JLabel ocrSourceImageLabel;
    private javax.swing.JLabel ocrTitleLabel;
    private javax.swing.JTabbedPane tabbedPane;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
}
