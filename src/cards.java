
import java.awt.*; 
import java.awt.image.BufferedImage; 
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
import javax.swing.*;  
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.io.IOException;



public class cards extends JFrame  {
	private int currCard = 1;
	private CardLayout layout;
	
	
	
	
	public void run(){
		setTitle("Card Layout Example");
		setSize(400,400);
		
		JPanel panel = new JPanel();
		layout = new CardLayout();

		
		//set layout for your panel
		panel.setLayout(layout);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		
		//creating labels for each card
		JLabel label1 = new JLabel("Card 1");
		JLabel label2 = new JLabel("Card 2");
		JLabel label3 = new JLabel("Card 3");
		JLabel label4 = new JLabel("Card 4");
		
		//placing labels in panel(card)
		panel1.add(label1);
		panel2.add(label2);
		panel3.add(label3);
		panel4.add(label4);
		
		JLabel label1_like = new JLabel("Likes: " + c1_l);
		panel1.add(label1_like);
		
		JLabel label1_dislike = new JLabel("Dis Likes: " + c1_d);
		panel1.add(label1_dislike);
		
		JLabel label2_like = new JLabel("Likes: " + c2_l);
		panel2.add(label2_like);
		
		JLabel label2_dislike = new JLabel("Dis Likes: " + c2_d);
		panel2.add(label2_dislike);
		
		JLabel label3_like = new JLabel("Likes: " + c3_l);
		panel3.add(label3_like);
		
		JLabel label3_dislike = new JLabel("Dis Likes: " + c3_d);
		panel3.add(label3_dislike);
		
		JLabel label4_like = new JLabel("Likes: " + c4_l);
		panel4.add(label4_like);
		
		JLabel label4_dislike = new JLabel("Dis Likes: " + c4_d);
		panel4.add(label4_dislike);
		
		
		//adding panels(cards) to the main panel
		panel.add(panel1, "1");
		panel.add(panel2, "2");
		panel.add(panel3, "3");
		panel.add(panel4, "4");
		
		//adding images to panel 1
		ImageIcon pic_0 = new ImageIcon("cat_2.jpg");
		Image image_0 = pic_0.getImage(); 
		Image newpic_0 = image_0.getScaledInstance(350, 350,  java.awt.Image.SCALE_SMOOTH);  
		pic_0 = new ImageIcon(newpic_0);  
	
		JLabel picLabel_0 = new JLabel(pic_0);
		panel1.add(picLabel_0);
	
		
		ImageIcon pic_1 = new ImageIcon("cat_3.jpg"); 
		Image image_1 = pic_1.getImage();
		Image newpic_1 = image_1.getScaledInstance(350, 350,  java.awt.Image.SCALE_SMOOTH);   
		pic_1 = new ImageIcon(newpic_1); 
		
		JLabel picLabel_1 = new JLabel(pic_1);
		panel2.add(picLabel_1);
		
		//adding images to panel 3
		ImageIcon pic_2 = new ImageIcon("cat_4.jpg");
		Image image_2 = pic_2.getImage(); 
		Image newpic_2 = image_2.getScaledInstance(350, 350,  java.awt.Image.SCALE_SMOOTH);  
		pic_2 = new ImageIcon(newpic_2); 
				
		JLabel picLabel_2 = new JLabel(pic_2);
		panel3.add(picLabel_2);
		
		//adding images to panel 4
		ImageIcon pic_3 = new ImageIcon("cat.jfif");
		Image image_3 = pic_3.getImage();
		Image newpic_3 = image_3.getScaledInstance(350, 350,  java.awt.Image.SCALE_SMOOTH);  
		pic_3 = new ImageIcon(newpic_3);
				
		JLabel picLabel_3 = new JLabel(pic_3);
		panel4.add(picLabel_3);
			
		
		ImageIcon Like = new ImageIcon("Like.png"); 
		Image Like1 = Like.getImage();  
		Image newimg1 = Like1.getScaledInstance(17, 17,  java.awt.Image.SCALE_SMOOTH);  
		Like = new ImageIcon(newimg1);
		
		ImageIcon disLike = new ImageIcon("dislike.png"); // load the image to a imageIcon
		Image disLike1 = disLike.getImage(); // transform it 
		Image newimg2 = disLike1.getScaledInstance(17, 17,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		disLike = new ImageIcon(newimg2);  // transform it back
		
		JPanel buttonPanel = new JPanel();
		
		JButton firstB = new JButton("first");
		JButton nextB = new JButton(">>");
		JButton prevB = new JButton("<<");
		JButton lastB = new JButton("last");
		JButton likes = new JButton(Like);
		JButton dislikes = new JButton(disLike);
		
		buttonPanel.add(firstB);
		buttonPanel.add(nextB);
		buttonPanel.add(prevB);
		buttonPanel.add(lastB);
		buttonPanel.add(likes);
		buttonPanel.add(dislikes);
		
		likes.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (currCard == 1) {
					c1_l++;
					label1_like.setText("Likes: " + c1_l);	
				} else if(currCard == 2) {
					c2_l++;
					label2_like.setText("Likes: " + c2_l);
				} else if(currCard == 3) {
					c3_l++;
					label3_like.setText("Likes: " + c3_l);
				} else if(currCard == 4) {
					c4_l++;
					label4_like.setText("Likes: " + c4_l);
				}
			}
		});
		
		dislikes.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (currCard == 1) {
					c1_d++;
					label1_dislike.setText("Dis Likes: " + c1_d);
					
				} else if(currCard == 2) {
					c2_d++;
					label2_dislike.setText("Dis Likes: " + c2_d);
				} else if(currCard == 3) {
					c3_d++;
					label3_dislike.setText("Dis Likes: " + c3_d);
				} else if(currCard == 4) {
					c4_d++;
					label4_dislike.setText("Dis Likes: " + c4_d);
				}
			}
		});
		
		firstB.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				layout.first(panel);
				currCard = 1;
			}
		});
		
		lastB.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				layout.last(panel);
				currCard = 4;
			}
		});
		
		nextB.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (currCard < 4) {
					currCard += 1;
					layout.show(panel, "" +currCard);
				}
				
			}
		});
		
		prevB.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (currCard > 1) {
					currCard -= 1;
					layout.show(panel, "" +currCard);
				}
				
			}
		});
		
		// using to get the content pane  
		getContentPane().add(panel, BorderLayout.NORTH);  
		  
		// using to get the content pane  
		getContentPane().add(buttonPanel, BorderLayout.SOUTH);  
	}

	public static void main(String[] args) {
		cards album = new cards();
		album.run();
		album.setDefaultCloseOperation(EXIT_ON_CLOSE);
		album.setVisible(true);

	}

}
