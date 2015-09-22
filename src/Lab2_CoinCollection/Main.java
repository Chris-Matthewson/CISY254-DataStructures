/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/** 
 * @author Chris Matthewson - G00192903
 */
public class Main {
    public static void main(String[] args) 
    {
        //create the test coin
        TestCoin tc = new TestCoin();
        
        //create the coin collection and run
        CoinCollection cc = new CoinCollection();
        cc.Run();
    }
    
}
