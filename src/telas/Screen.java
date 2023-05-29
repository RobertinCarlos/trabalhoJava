package telas;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import utils.Pessoa;

public class Screen extends JFrame{

    ArrayList<Pessoa> Pessoas;
    Container c = this.getContentPane();
    public ArrayList<JPanel> telas;
    GridBagLayout grid;

    public Screen(){
        
        this.Pessoas = new ArrayList<>();
        
        this.grid = new GridBagLayout();
        
        this.c = this.getContentPane();
        this.setTitle("Claudinei"); //Add the title to this
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Terminate program on close button
        this.setBounds(0, 0, 1080, 720); //Sets the position of the this
        this.setLocationRelativeTo(null);
        this.setLayout(grid); //Terminates default flow layout
        // this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        // this.setUndecorated(true);
        this.setVisible(true); // Exhibit the frame
        this.setMinimumSize(new Dimension(1080, 720));
        this.setResizable(false);

        this.telas = new ArrayList<>();
        this.telas.add(new tela1(this));
        // this.addComponentListener(new ComponentAdapter() 
        // {  
        //         public void componentResized(ComponentEvent evt) {
        //             Component c = (Component)evt.getSource();
        //             System.out.println(c.getSize());
        //         }
        // });
    }

    public void setTela(int index){
        if(this.getComponentCount() > 0){
            this.c.removeAll();;
        }
        this.c.add(telas.get(index));
        this.revalidate();
    }
}