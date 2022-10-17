package tetris;

import javax.swing.*;
import java.util.Objects;

public class PauseButton extends JButton  {
    String state="Start";
        PauseButton(){
            this.setText(""+state);
            this.addActionListener(e->{
                if(state.equals("Start")){
                    this.setText("Pause");
                    setState("Pause");
                }else{
                    if(Objects.equals(state, "Pause")){
                        this.setText("Resume");
                        setState("Resume");
                    }else{
                        this.setText("Pause");
                        setState("Pause");
                    }

                }

            });

        }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
