package testopencv;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Jarviz
 */
public class JFrameOpenCV extends javax.swing.JFrame {

    public String filename;
    public static BufferedImage ishImage;
    public static Image Imagea;
    static boolean openImage = false;
    static int[] gistMass;
    static int maxGist;
    static int minGist;
    int ishImLabelWidth;
    int ishImLabelHeight;
    int ishWidth;
    int ishHeight;

    public JFrameOpenCV() {
	initComponents();
	ishImLabelWidth = ishImLabel.getWidth();
	ishImLabelHeight = ishImLabel.getHeight();
    }
    ExtFileFilter filter = new ExtFileFilter("jpg", "*.jpg изображения");
    ExtFileFilter filter1 = new ExtFileFilter("png", "*.png изображения");
    BufferedImage newImage;
    BufferedImage endImage;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        ishImLabel = new javax.swing.JLabel();
        endImLabel = new javax.swing.JLabel();
        grayButton = new javax.swing.JButton();
        errorBinLabel = new javax.swing.JLabel();
        gistLabel = new javax.swing.JLabel();
        shumButton = new javax.swing.JButton();
        shumList = new javax.swing.JComboBox();
        shumSpinner = new javax.swing.JSpinner();
        shumLabel = new javax.swing.JLabel();
        gistLabel1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        linCor = new javax.swing.JButton();
        lowFilter = new javax.swing.JButton();
        gistIshList = new javax.swing.JComboBox();
        gistEndList = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        sobel = new javax.swing.JButton();
        gamma = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        gammaStepSpiner = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        gammaConstSpiner = new javax.swing.JSpinner();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        ishImLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ishImLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        endImLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        endImLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        grayButton.setText("Градация серого");
        grayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grayButtonActionPerformed(evt);
            }
        });

        gistLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        shumButton.setText("Шум");
        shumButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shumButtonActionPerformed(evt);
            }
        });

        shumList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Соль и перец", "Гаусс" }));

        shumSpinner.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1.0d, 0.1d));

        shumLabel.setText("Порог [0;1]");

        gistLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Гистограмма исходной картинки:");

        jLabel2.setText("Гистограмма картинки после обработки:");

        jLabel6.setText("0");

        jLabel7.setText("0");

        jLabel8.setText("255");

        jLabel9.setText("255");

        linCor.setEnabled(false);
        linCor.setText("Линейная коррекция");
        linCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linCorActionPerformed(evt);
            }
        });

        lowFilter.setEnabled(false);
        lowFilter.setText("Низкочастотный фильтр");
        lowFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lowFilterActionPerformed(evt);
            }
        });

        gistIshList.setEnabled(false);
        gistIshList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Серый", "Красный", "Зелёный", "Синий" }));
        gistIshList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gistIshListActionPerformed(evt);
            }
        });

        gistEndList.setEnabled(false);
        gistEndList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Серый", "Красный", "Зелёный", "Синий" }));
        gistEndList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gistEndListActionPerformed(evt);
            }
        });

        jLabel10.setText("Канал:");

        jLabel11.setText("Канал:");

        lowFilter.setEnabled(false);
        sobel.setText("Оператор Собеля");
        sobel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobelActionPerformed(evt);
            }
        });

        gamma.setText("Гамма-коррекция");
        gamma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gammaActionPerformed(evt);
            }
        });

        jLabel12.setText("Степень:");

        gammaStepSpiner.setModel(new javax.swing.SpinnerNumberModel(Double.valueOf(1.0d), null, null, Double.valueOf(0.1d)));

        jLabel13.setText("Константа:");

        gammaConstSpiner.setModel(new javax.swing.SpinnerNumberModel(Double.valueOf(1.0d), null, null, Double.valueOf(0.1d)));

        jMenu1.setText("File");

        jMenuItem1.setText("Open");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ishImLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endImLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gistIshList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel9))
                                            .addComponent(gistLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(68, 68, 68)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(linCor)
                                            .addComponent(lowFilter))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gistEndList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8))
                                .addComponent(jLabel2)
                                .addComponent(gistLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(shumButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(shumList, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(shumLabel)
                                .addGap(18, 18, 18)
                                .addComponent(shumSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(gamma)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gammaStepSpiner, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gammaConstSpiner, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sobel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(grayButton)
                                .addGap(56, 56, 56)
                                .addComponent(errorBinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(errorBinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(grayButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(shumButton)
                            .addComponent(shumList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(shumSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(shumLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(linCor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lowFilter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sobel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gamma))
                            .addComponent(jLabel12)
                            .addComponent(gammaStepSpiner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(gammaConstSpiner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58))
                    .addComponent(ishImLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(endImLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(gistIshList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(gistEndList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gistLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gistLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        grayButton.setEnabled(false);
        shumButton.setEnabled(false);
        shumList.setEnabled(false);
        shumSpinner.setEnabled(false);
        shumLabel.setEnabled(false);
        sobel.setEnabled(false);
        gamma.setEnabled(false);
        jLabel12.setEnabled(false);
        gammaStepSpiner.setEnabled(false);
        jLabel13.setEnabled(false);
        gammaConstSpiner.setEnabled(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

	jFileChooser1.setCurrentDirectory(new File("D:\\"));
	jFileChooser1.setFileFilter(filter1);
	jFileChooser1.setFileFilter(filter);
	jFileChooser1.showOpenDialog(this);
	if (jFileChooser1.getSelectedFile() != null) {
	    filename = jFileChooser1.getSelectedFile().getAbsolutePath();

	    try {
		open(filename);
		ishWidth = ishImage.getWidth();
		ishHeight = ishImage.getHeight();
		double scale;
		if (ishWidth > ishHeight) {
		    if (ishWidth > ishImLabelWidth) {
			scale = ishImage.getWidth() / ishImLabelWidth;
			ishWidth = ishImLabelWidth;
			ishHeight = (int) (ishHeight / scale);
		    }
		}
		if (ishHeight > ishWidth) {
		    if (ishHeight > ishImLabelHeight) {
			scale = ishImage.getHeight() / ishImLabelHeight;
			ishHeight = ishImLabelHeight;
			ishWidth = (int) (ishWidth / scale);
		    }
		}
		ImageIcon iconn = new ImageIcon(ishImage.getScaledInstance(ishWidth, ishHeight, Image.SCALE_DEFAULT));
		ishImLabel.setIcon(iconn);
		grayButton.setEnabled(true);
	    //binButton.setEnabled(true);
		//binSpinner.setEnabled(true);
		lowFilter.setEnabled(true);
		linCor.setEnabled(true);
		gistIshList.setEnabled(true);
		shumButton.setEnabled(true);
		shumLabel.setEnabled(true);
		shumList.setEnabled(true);
		shumSpinner.setEnabled(true);

		sobel.setEnabled(true);
		gamma.setEnabled(true);
		jLabel12.setEnabled(true);
		gammaStepSpiner.setEnabled(true);
		jLabel13.setEnabled(true);
		gammaConstSpiner.setEnabled(true);

		gistIsh();
	    } catch (IOException ex) {
		Logger.getLogger(JFrameOpenCV.class.getName()).log(Level.SEVERE, null, ex);
	    }
	}
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public void endImage() {
	try {
	    ImageIO.write(newImage, "png", new File("D:\\end.png"));
	    System.out.println("Сохранено обработанное изображение D:\\end.png ");
	} catch (IOException ex) {
	    System.out.println("Ошибка сохранения изображения");
	    Logger.getLogger(JFrameOpenCV.class.getName()).log(Level.SEVERE, null, ex);
	}
	ImageIcon icon = new ImageIcon(newImage.getScaledInstance(ishWidth, ishHeight, Image.SCALE_DEFAULT));
	endImage = newImage;
	endImLabel.setIcon(icon);
	errorBinLabel.setText(null);
	gistEndList.setEnabled(true);
	gistEnd();
    }

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
	this.dispose();
	dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void grayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grayButtonActionPerformed
	newImage = new BufferedImage(ishImage.getWidth(), ishImage.getHeight(), BufferedImage.TYPE_INT_ARGB);
	for (int x = 0; x < ishImage.getWidth(); x++) {
	    for (int y = 0; y < ishImage.getHeight(); y++) {
		Color color = new Color(ishImage.getRGB(x, y));
		int red = color.getRed();
		int blue = color.getBlue();
		int green = color.getGreen();
		int il = (int) ((0.3 * red) + (0.59 * green) + (0.11 * blue));

		int pop = new Color(il, il, il).getRGB();
		newImage.setRGB(x, y, pop);
	    }
	}
	endImage();
    }//GEN-LAST:event_grayButtonActionPerformed

    private void gistIsh() {
	gistMass = new int[256];
	int pop = 0;
	switch (gistIshList.getSelectedItem().toString()) {
	    case "Серый": {
		System.out.println("Gray");
		pop = new Color(0, 0, 0).getRGB();
		for (int x = 0; x < ishImage.getWidth(); x++) {
		    for (int y = 0; y < ishImage.getHeight(); y++) {
			Color color = new Color(ishImage.getRGB(x, y));
			int red = color.getRed();
			int blue = color.getBlue();
			int green = color.getGreen();
			int gray = (int) ((0.3 * red) + (0.59 * green) + (0.11 * blue));
			gistMass[gray]++;
		    }
		}
		break;
	    }
	    case "Красный": {
		System.out.println("Red");
		pop = new Color(255, 0, 0).getRGB();
		for (int x = 0; x < ishImage.getWidth(); x++) {
		    for (int y = 0; y < ishImage.getHeight(); y++) {
			Color color = new Color(ishImage.getRGB(x, y));
			int red = color.getRed();
			gistMass[red]++;
		    }
		}
		break;
	    }
	    case "Зелёный": {
		System.out.println("Green");
		pop = new Color(0, 255, 0).getRGB();
		for (int x = 0; x < ishImage.getWidth(); x++) {
		    for (int y = 0; y < ishImage.getHeight(); y++) {
			Color color = new Color(ishImage.getRGB(x, y));
			int green = color.getGreen();
			gistMass[green]++;
		    }
		}
		break;
	    }
	    case "Синий": {
		System.out.println("Blue");
		pop = new Color(0, 0, 255).getRGB();
		for (int x = 0; x < ishImage.getWidth(); x++) {
		    for (int y = 0; y < ishImage.getHeight(); y++) {
			Color color = new Color(ishImage.getRGB(x, y));
			int blue = color.getBlue();
			gistMass[blue]++;
		    }
		}
		break;
	    }
	}

	int max = 0;
	int max2 = 0;
	int min2 = 255;
	boolean minin = false;
	boolean maxin = false;
	for (int i = 0; i < gistMass.length; i++) {

	    if (max < gistMass[i]) {
		max = gistMass[i];
	    }
	    if (!minin) {
		if (gistMass[i] != 0) {
		    min2 = i;
		    minin = true;
		}
	    }
	    if (gistMass[i] != 0) {
		max2 = i;
	    }
	}
	maxGist = max2;
	minGist = min2;
	jLabel5.setText(String.valueOf(max));

	newImage = new BufferedImage(256, 160, BufferedImage.TYPE_INT_ARGB);

	for (int i = 0; i < 256; i++) {
	    for (int j = 0; j < gistMass[i]; j++) {
		int lol = max - j;
		lol = (lol * 144) / max;
		newImage.setRGB(i, lol, pop);
	    }
	}
	ImageIcon icon = new ImageIcon(newImage);
	gistLabel.setIcon(icon);
    }

    private void gistEnd() {
	gistMass = new int[256];
	newImage = endImage;
	int pop = 0;
	switch (gistEndList.getSelectedItem().toString()) {
	    case "Серый": {
		pop = new Color(0, 0, 0).getRGB();
		for (int x = 0; x < newImage.getWidth(); x++) {
		    for (int y = 0; y < newImage.getHeight(); y++) {
			Color color = new Color(newImage.getRGB(x, y));
			int red = color.getRed();
			int blue = color.getBlue();
			int green = color.getGreen();
			int il = (int) ((0.3 * red) + (0.59 * green) + (0.11 * blue));
			gistMass[il]++;
		    }
		}
		break;
	    }
	    case "Красный": {
		pop = new Color(255, 0, 0).getRGB();
		for (int x = 0; x < newImage.getWidth(); x++) {
		    for (int y = 0; y < newImage.getHeight(); y++) {
			Color color = new Color(newImage.getRGB(x, y));
			int red = color.getRed();
			gistMass[red]++;
		    }
		}
		break;
	    }
	    case "Зелёный": {
		pop = new Color(0, 255, 0).getRGB();
		for (int x = 0; x < newImage.getWidth(); x++) {
		    for (int y = 0; y < newImage.getHeight(); y++) {
			Color color = new Color(newImage.getRGB(x, y));
			int green = color.getGreen();
			gistMass[green]++;
		    }
		}
		break;
	    }
	    case "Синий": {
		pop = new Color(0, 0, 255).getRGB();
		for (int x = 0; x < newImage.getWidth(); x++) {
		    for (int y = 0; y < newImage.getHeight(); y++) {
			Color color = new Color(newImage.getRGB(x, y));
			int blue = color.getBlue();
			gistMass[blue]++;
		    }
		}
		break;
	    }
	}
	int max = 0;
	for (int i = 0; i < gistMass.length; i++) {

	    if (max < gistMass[i]) {
		max = gistMass[i];
	    }
	}
	jLabel4.setText(String.valueOf(max));

	newImage = new BufferedImage(256, 160, BufferedImage.TYPE_INT_ARGB);

	for (int i = 0; i < 256; i++) {
	    for (int j = 0; j < gistMass[i]; j++) {
		int lol = max - j;
		lol = (lol * 144) / max;
		newImage.setRGB(i, lol, pop);
	    }
	}
	ImageIcon icon = new ImageIcon(newImage);//newImage.getScaledInstance(gistLabel.getWidth(), gistLabel.getHeight(), Image.SCALE_DEFAULT));
	gistLabel1.setIcon(icon);
    }

    private void shumButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shumButtonActionPerformed
	newImage = new BufferedImage(ishImage.getWidth(), ishImage.getHeight(), BufferedImage.TYPE_INT_ARGB);
	int white = new Color(255, 255, 255).getRGB();
	int black = new Color(0, 0, 0).getRGB();
	if ("Соль и перец".equals(shumList.getSelectedItem().toString())) {
	    for (int x = 0; x < ishImage.getWidth(); x++) {
		for (int y = 0; y < ishImage.getHeight(); y++) {
		    double porog = Double.valueOf(shumSpinner.getValue().toString());
		    double rand = Math.random();
		    double rand2 = Math.random();
		    if (rand > porog) {
			if (rand2 > 0.5) {
			    newImage.setRGB(x, y, white);
			} else {
			    newImage.setRGB(x, y, black);
			}
		    } else {
			newImage.setRGB(x, y, ishImage.getRGB(x, y));
		    }
		}
	    }
	}
	if ("Гаусс".equals(shumList.getSelectedItem().toString())) {
	    for (int x = 0; x < ishImage.getWidth(); x++) {
		for (int y = 0; y < ishImage.getHeight(); y++) {
		    Color color = new Color(ishImage.getRGB(x, y));
		    int red = color.getRed();
		    int blue = color.getBlue();
		    int green = color.getGreen();
		    double porog = Double.valueOf(shumSpinner.getValue().toString());
		    double rand = Math.random();
		    if (rand > 0.5) {
			rand = (-1) * rand;
		    }
		    double gau = rand * porog * 200;
		    int gaus = (int) gau;
		    red = red + gaus;
		    green = green + gaus;
		    blue = blue + gaus;
		    red = range(red);
		    green = range(green);
		    blue = range(blue);
		    newImage.setRGB(x, y, new Color(red, green, blue).getRGB());
		}
	    }
	}
	endImage();
    }//GEN-LAST:event_shumButtonActionPerformed

    private void linCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linCorActionPerformed
	newImage = new BufferedImage(ishImage.getWidth(), ishImage.getHeight(), BufferedImage.TYPE_INT_ARGB);
	int[] gistMass1 = new int[256];
	int[] gistMass2 = new int[256];
	int[] gistMass3 = new int[256];
	for (int x = 0; x < ishImage.getWidth(); x++) {
	    for (int y = 0; y < ishImage.getHeight(); y++) {
		Color color = new Color(ishImage.getRGB(x, y));
		int red = color.getRed();
		int blue = color.getBlue();
		int green = color.getGreen();
		gistMass1[red]++;
		gistMass2[green]++;
		gistMass3[blue]++;
	    }
	}
	int maxR = 0;
	int minR = 255;
	boolean minin = false;
	for (int i = 0; i < gistMass1.length; i++) {
	    if (!minin) {
		if (gistMass1[i] != 0) {
		    minR = i;
		    minin = true;
		}
	    }
	    if (gistMass1[i] != 0) {
		maxR = i;
	    }
	}
	int maxG = 0;
	int minG = 255;
	minin = false;
	for (int i = 0; i < gistMass2.length; i++) {
	    if (!minin) {
		if (gistMass2[i] != 0) {
		    minG = i;
		    minin = true;
		}
	    }
	    if (gistMass2[i] != 0) {
		maxG = i;
	    }
	}

	int maxB = 0;
	int minB = 255;
	minin = false;
	for (int i = 0; i < gistMass3.length; i++) {
	    if (!minin) {
		if (gistMass3[i] != 0) {
		    minB = i;
		    minin = true;
		}
	    }
	    if (gistMass3[i] != 0) {
		maxB = i;
	    }
	}
	for (int x = 0; x < ishImage.getWidth(); x++) {
	    for (int y = 0; y < ishImage.getHeight(); y++) {
		Color color = new Color(ishImage.getRGB(x, y));
		int red = color.getRed();
		int green = color.getGreen();
		int blue = color.getBlue();
		double r = red - minR;
		r = r / (maxR - minR);
		r = r * 255;
		double g = green - minG;
		g = g / (maxG - minG);
		g = g * 255;
		double b = blue - minB;
		b = b / (maxB - minB);
		b = b * 255;
		int newR = (int) r;
		int newG = (int) g;
		int newB = (int) b;
		newImage.setRGB(x, y, new Color(newR, newG, newB).getRGB());
	    }
	}
	endImage();
    }//GEN-LAST:event_linCorActionPerformed

    private void lowFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lowFilterActionPerformed
	newImage = null;
	newImage = new BufferedImage(ishImage.getWidth() + 2, ishImage.getHeight() + 2, BufferedImage.TYPE_INT_ARGB);
	int pop = new Color(0, 0, 0).getRGB();
	for (int x = 0; x < newImage.getWidth(); x++) {
	    for (int y = 0; y < newImage.getHeight(); y++) {
		newImage.setRGB(x, y, pop);
	    }
	}
	for (int x = 0; x < ishImage.getWidth(); x++) {
	    for (int y = 0; y < ishImage.getHeight(); y++) {
		Color color = new Color(ishImage.getRGB(x, y));
		pop = color.getRGB();
		newImage.setRGB(x + 1, y + 1, pop);
	    }
	}
	int[][] Mask = new int[3][3];
	for (int i = 0; i < 3; i++) {
	    for (int j = 0; j < 3; j++) {
		Mask[i][j] = 1;
	    }
	}
	int kof = 9;
	for (int x = 1; x < newImage.getWidth() - 1; x++) {
	    for (int y = 1; y < newImage.getHeight() - 1; y++) {
		int buf1 = 0;
		int buf2 = 0;
		int buf3 = 0;
		int newRed;
		int newGreen;
		int newBlue;
		for (int k = 0; k < 3; k++) {
		    for (int l = 0; l < 3; l++) {
			int cxz = x + (k - 1);
			int cxzx = y + (l - 1);
			Color color = new Color(newImage.getRGB(cxz, cxzx));
			int red = color.getRed();
			int green = color.getGreen();
			int blue = color.getBlue();
			buf1 += Mask[k][l] * red;
			buf2 += Mask[k][l] * green;
			buf3 += Mask[k][l] * blue;
		    }
		}
		newRed = (int) (buf1 / kof);
		newGreen = (int) (buf2 / kof);
		newBlue = (int) (buf3 / kof);
		pop = new Color(newRed, newGreen, newBlue).getRGB();
		newImage.setRGB(x - 1, y - 1, pop);
	    }
	}
	endImage();
    }//GEN-LAST:event_lowFilterActionPerformed

    private void gistIshListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gistIshListActionPerformed
	gistIsh();
    }//GEN-LAST:event_gistIshListActionPerformed

    private void gistEndListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gistEndListActionPerformed
	gistEnd();
    }//GEN-LAST:event_gistEndListActionPerformed

    private void sobelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobelActionPerformed
	newImage = null;
	newImage = new BufferedImage(ishImage.getWidth() + 2, ishImage.getHeight() + 2, BufferedImage.TYPE_INT_ARGB);
	int pop = new Color(0, 0, 0).getRGB();
	for (int x = 0; x < newImage.getWidth(); x++) {
	    for (int y = 0; y < newImage.getHeight(); y++) {
		newImage.setRGB(x, y, pop);
	    }
	}
	for (int x = 0; x < ishImage.getWidth(); x++) {
	    for (int y = 0; y < ishImage.getHeight(); y++) {
		Color color = new Color(ishImage.getRGB(x, y));
		pop = color.getRGB();
		newImage.setRGB(x + 1, y + 1, pop);
	    }
	}
	int[][] Mask = {
	    {1, 2, 1},
	    {0, 0, 0},
	    {-1, -2, -1}
	};
	int[][] Mask2 = {
	    {-1, 0, 1},
	    {-2, 0, 2},
	    {-1, 0, 1}
	};
	for (int x = 1; x < newImage.getWidth() - 1; x++) {
	    for (int y = 1; y < newImage.getHeight() - 1; y++) {
		double buf1 = 0;
		double buf11 = 0;
		for (int k = 0; k < 3; k++) {
		    for (int l = 0; l < 3; l++) {
			int a = x + (k - 1);
			int b = y + (l - 1);
			Color color = new Color(newImage.getRGB(a, b));
			int red = color.getRed();
			int green = color.getGreen();
			int blue = color.getBlue();
			int gray = (int) (red * 0.3 + green * 0.59 + blue * 0.11);
			buf1 += Mask[k][l] * gray;
			buf11 += Mask2[k][l] * gray;
		    }
		}
		double newGray = Math.pow(buf1, 2) + Math.pow(buf11, 2);
//		newGray = Math.atan(buf11/buf1);
		newGray = Math.min(Math.sqrt(newGray), 255);
//		newGray = buf11;
		newGray = range((int) newGray);
		newGray = 255.0 - newGray;
		int newc = (int) newGray;
		pop = new Color(newc, newc, newc).getRGB();
		newImage.setRGB(x - 1, y - 1, pop);
	    }
	}
	endImage();
    }//GEN-LAST:event_sobelActionPerformed

    private void gammaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gammaActionPerformed
	newImage = new BufferedImage(ishImage.getWidth(), ishImage.getHeight(), BufferedImage.TYPE_INT_ARGB);
	double step = (double) gammaStepSpiner.getValue();
	double constan = (double) gammaConstSpiner.getValue();
	for (int x = 0; x < ishImage.getWidth(); x++) {
	    for (int y = 0; y < ishImage.getHeight(); y++) {
		Color color = new Color(ishImage.getRGB(x, y));
		int red = color.getRed();
		int blue = color.getBlue();
		int green = color.getGreen();
		red = (int) (constan * Math.pow(red, step));
		green = (int) (constan * Math.pow(green, step));
		blue = (int) (constan * Math.pow(blue, step));
		red = range(red);
		green = range(green);
		blue = range(blue);
		int pop = new Color(red, green, blue).getRGB();
		newImage.setRGB(x, y, pop);
	    }
	}
	endImage();
    }//GEN-LAST:event_gammaActionPerformed

    private int range(int col) {
	if (col > 255) {
	    col = 255;
	}
	if (col < 0) {
	    col = 0;
	}
	return col;
    }

    public static void open(String filename) throws IOException {
	ishImage = ImageIO.read(new File(filename));
	if (ishImage != null) {
	    openImage = true;
	}
    }

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
	    java.util.logging.Logger.getLogger(JFrameOpenCV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(JFrameOpenCV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(JFrameOpenCV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(JFrameOpenCV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new JFrameOpenCV().setVisible(true);
	    }
	});
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel endImLabel;
    private javax.swing.JLabel errorBinLabel;
    private javax.swing.JButton gamma;
    private javax.swing.JSpinner gammaConstSpiner;
    private javax.swing.JSpinner gammaStepSpiner;
    private javax.swing.JComboBox gistEndList;
    private javax.swing.JComboBox gistIshList;
    private javax.swing.JLabel gistLabel;
    private javax.swing.JLabel gistLabel1;
    private javax.swing.JButton grayButton;
    private javax.swing.JLabel ishImLabel;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JButton linCor;
    private javax.swing.JButton lowFilter;
    private javax.swing.JButton shumButton;
    private javax.swing.JLabel shumLabel;
    private javax.swing.JComboBox shumList;
    private javax.swing.JSpinner shumSpinner;
    private javax.swing.JButton sobel;
    // End of variables declaration//GEN-END:variables

    class ExtFileFilter extends javax.swing.filechooser.FileFilter {

	String ext;
	String description;

	ExtFileFilter(String ext, String descr) {
	    this.ext = ext;
	    description = descr;
	}

	public boolean accept(File f) {
	    if (f != null) {
		if (f.isDirectory()) {
		    return true;
		}
		String extension = getExtension(f);
		if (extension == null) {
		    return (ext.length() == 0);
		}
		return ext.equals(extension);
	    }
	    return false;
	}

	public String getExtension(File f) {
	    if (f != null) {
		String filename = f.getName();
		int i = filename.lastIndexOf('.');
		if (i > 0 && i < filename.length() - 1) {
		    return filename.substring(i + 1).toLowerCase();
		}
	    }
	    return null;
	}

	public String getDescription() {
	    return description;
	}
    }
}
