package telas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import telas.components.InserirFields;
import telas.components.classes.ScrnChanger;

public class inserir extends JPanel{
    public Screen scrn;
    GridBagLayout grid = new GridBagLayout();
    GridBagConstraints c = new GridBagConstraints();

    public ArrayList<Object> params = new ArrayList<>(6);
    Object[] TextsFields = {"Código", "Nome", "Bairro", "Cidade", "Estado", "CPF"};

    public inserir(Screen Scrn){
        super();
        this.scrn = Scrn;
        this.setPreferredSize(new Dimension(1064, 680));
        this.setSize(this.scrn.getSize());
        this.setBounds(this.scrn.getBounds());
        this.setBackground(new Color(255,2,25));
        this.setLayout(grid);

        for (int i = 0; i < TextsFields.length; i++) {
            this.params.add(null);
        }

        this.add(new ScrnChanger("Voltar", this.scrn, 0), this.c);
        
        this.add(new InserirFields(this));
    }
    
    public void show(int index){
        this.scrn.setTela(0);
    }

    public void limparParams(){
        for (int i = 0; i < this.params.size(); i++) {
            this.params.set(i, null);
        }
    }
}
