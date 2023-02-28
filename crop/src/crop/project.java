//package crop;
//
//import java.awt.EventQueue;
//
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;
//import javax.swing.JTextArea;
//import java.awt.Color;
//import java.awt.Font;
//import javax.swing.JLabel;
//import javax.imageio.ImageIO;
//import javax.swing.JButton;
//import javax.swing.JFileChooser;
//
//import java.awt.event.ActionListener;
//import java.awt.image.BufferedImage;
//import java.io.IOException;
//import java.awt.event.ActionEvent;
//
//public class project extends JFrame {
//
//	private JPanel contentPane;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					project frame = new project();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the frame.
//	 */
//	public project() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 799, 592);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//
//		setContentPane(contentPane);
//		contentPane.setLayout(null);
//		
//		JTextArea txtrImageFeatures = new JTextArea();
//		txtrImageFeatures.setWrapStyleWord(true);
//		txtrImageFeatures.setFont(new Font("Sitka Heading", Font.BOLD, 36));
//		txtrImageFeatures.setForeground(new Color(192, 192, 192));
//		txtrImageFeatures.setBackground(new Color(0, 64, 128));
//		txtrImageFeatures.setText("Image Features");
//		txtrImageFeatures.setBounds(242, 56, 260, 37);
//		contentPane.add(txtrImageFeatures);
//		
//		JLabel lblNewLabel = new JLabel("");
//		lblNewLabel.setBounds(42, 56, 190, 422);
//		contentPane.add(lblNewLabel);
//		
//		JButton btnNewButton = new JButton("image");
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				 
////						  File file = new File("C:\\Users\\KIIT\\OneDrive\\Pictures\\IMG20220930124645 (2).jpg");
//						  JFileChooser file=new JFileChooser();
//					      BufferedImage image = ImageIO.read(file);
//					    int width = image.getWidth();
//					    int height = image.getHeight();
//					    
//					    // Create a 2D array to store the average color of each region
//					    int[][] averageColors = new int[width][height];
//					    
//					    // Loop through all pixels in the image
//					    for (int i = 0; i < width; i++) {
//					      for (int j = 0; j < height; j++) {
//					        // Get the RGB values of the current pixel
//					        int rgb = image.getRGB(i, j);
//					        
//					        // Extract the red, green, and blue components of the color
//					        int red = (rgb >> 16) & 0xFF;
//					        int green = (rgb >> 8) & 0xFF;
//					        int blue = rgb & 0xFF;
//					        
//					        // Calculate the average color of the current region
//					        averageColors[i][j] = (red + green + blue) / 3;
//					        System.out.println("the everage color rgb value is "+  averageColors[i][j] );
//					       
//					        
//					      }
//					     
//					    
//					   
//			}
//			}});
//		btnNewButton.setFont(new Font("Sitka Heading", Font.BOLD, 16));
//		btnNewButton.setBounds(307, 299, 168, 37);
//		contentPane.add(btnNewButton);
//	}
//}
