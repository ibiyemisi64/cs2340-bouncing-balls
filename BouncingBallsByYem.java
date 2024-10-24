/********************************************************************************
 *                                                                              *
 *  Copyright (c) 2024 Ibiyemisi Gbenebor                                      *
 *                                                                              *
 *  All rights reserved.                                                        *
 *                                                                              *
 *  This software is provided "as is", without any express or implied warranty, *
 *  including but not limited to the warranties of merchantability, fitness for *
 *  a particular purpose, and noninfringement. In no event shall the authors    *
 *  or copyright holders be liable for any claim, damages, or other liability,  *
 *  whether in an action of contract, tort, or otherwise, arising from, out of, *
 *  or in connection with the software or the use or other dealings in the       *
 *  software.                                                                   *
 *                                                                              *
 ********************************************************************************/

import javax.swing.*;

public class BouncingBallsByYem {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                BallGame game = new BallGame();

                JFrame frame = new JFrame("Yemisi's Bouncing Balls");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setContentPane(game);
                frame.pack();
                frame.setSize(640, 480);
                frame.setVisible(true);

                AIAgent aiAgent = new AIAgent(game);
                Thread aiThread = new Thread(aiAgent);
                aiThread.start();
            }
        });
    }
}
