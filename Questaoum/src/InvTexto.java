import java.util.Scanner;
/*
        
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thibe_000
 */
public class InvTexto {
    public static void main (String[]args){
        int d,x,ctr,n;
        NodeStack s = new NodeStack();
        Scanner in = new Scanner(System.in);
        
        n= in.nextInt();
        ctr=0;
        x=n;
        d=2;
        while (x%d==0){
            s.push(d);
            ctr++;
            x=x/d;
        }
        for(d=3; d<Math.sqrt(n); d+=2)
            while(x%d==0){
                s.push(d);
                ctr++;
                x=x/d;
            }
        for (int i=0; i<ctr; i++)
            System.out.print(""+ s.pop());
        System.out.println();
                      
        
        }
    
}
