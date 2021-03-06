# Frequency-Analysis-Application


![result](https://user-images.githubusercontent.com/76902107/119702930-b05cb100-be5e-11eb-842e-97303a6b645f.PNG)




Frequency analysis is based on the fact that, in any given stretch of written language, certain letters and combinations of letters occur with varying frequencies. In this assignment you should develop an application  helping to crypto analyst  to making frequency analysis on cipher text. Application should be flexible to use any given input cipher text with different languages ( German, French, Russian, Turkish etc.)
Application should be run in command line (No GUI) and should take one arguments. 
This argument should take cipher text as input.   So you should run application like that: 

#java analysis cipher.txt 
#or for interpreted languages  
#analysis cipher.txt 

After application run it must analyze cipher and give statistic of chars at the same screen as  given following part:  
#----------------------------------------------------------BEGIN-------------------------------------------------------------------------------  
#Cipher Text:  GFS WMY OG LGDVS MF SFNKYHOSU ESLLMRS, PC WS BFGW POL DMFRQMRS, PL OG CPFU M UPCCSKSFO HDMPFOSXO GC OIS LMES DMFRQMRS DGFR SFGQRI OG CPDD GFS LISSO GK LG, MFU OISF WS NGQFO OIS GNNQKKSFNSL GC SMNI DSOOSK. WS NMDD OIS EGLO CKSJQSFODY GNNQKKPFR DSOOSK OIS 'CPKLO', OIS FSXO EGLO GNNQKKPFR DSOOSK OIS 'LSNGFU' OIS CGDDGWPFR EGLO GNNQKKPFR DSOOSK OIS 'OIPKU', MFU LG GF, QFOPD WS MNNGQFO CGK MDD OIS UPCCSKSFO DSOOSKL PF OIS HDMPFOSXO LMEHDS. OISF WS DGGB MO OIS NPHISK OSXO WS WMFO OG LGDVS MFU WS MDLG NDMLLPCY POL LYEAGDL. WS CPFU OIS EGLO GNNQKKPFR LYEAGD MFU NIMFRS PO OG OIS CGKE GC OIS 'CPKLO' DSOOSK GC OIS HDMPFOSXO LMEHDS, OIS FSXO EGLO NGEEGF LYEAGD PL NIMFRSU OG OIS CGKE GC OIS 'LSNGFU' DSOOSK, MFU OIS CGDDGWPFR EGLO NGEEGF LYEAGD PL NIMFRSU OG OIS CGKE GC OIS 'OIPKU' DSOOSK, MFU LG GF, QFOPD WS MNNGQFO CGK MDD LYEAGDL GC OIS NKYHOGRKME WS WMFO OG LGDVS.

#Analysis:  S->88 , O->80, G->67, F->51, D->42, L->39 (So on.....)
#Option:  1) Take replace rule  
#2) Exit  Option>   
#------------------------------------------------------------END--------------------------------------------------------------------------------  
#If option 1 will be typed then system should  be get replacement rule for analysis. Format of rule looks like CSV like input. Please check example : 
#----------------------------------------------------------BEGIN------------------------------------------------------------------------------  
#Enter replacement rule-> M:a,A:b,N:c,U:d,S:e,C:f, (So on...)  
#------------------------------------------------------------END----------------------------------------------------------------------------  
#Input format description  (input pairs should be separated by comma ",")   
#Cipher Text Char:Plain Text Char  After input given according to given input all cipher text chars should be replaced by given rule. 
#So   M replaced as a , A replaced by b and so on..  
#Then program should be give following output: 
#----------------------------------------------------------BEGIN-------------------------------------------------------------------------------  
#Cipher Text:  
#GFS WMY OG LGDVS MF SFNKYHOSU ESLLMRS, PC WS BFGW POL DMFRQMRS, PL OG CPFU M UPCCSKSFO HDMPFOSXO GC OIS LMES DMFRQMRS DGFR SFGQRI OG CPDD GFS LISSO GK LG, MFU OISF WS NGQFO OIS GNNQKKSFNSL GC SMNI DSOOSK. WS NMDD OIS EGLO CKSJQSFODY GNNQKKPFR DSOOSK OIS 'CPKLO', OIS FSXO EGLO GNNQKKPFR DSOOSK OIS 'LSNGFU' OIS CGDDGWPFR EGLO GNNQKKPFR DSOOSK OIS 'OIPKU', MFU LG GF, QFOPD WS MNNGQFO CGK MDD OIS UPCCSKSFO DSOOSKL PF OIS HDMPFOSXO LMEHDS. OISF WS DGGB MO OIS NPHISK OSXO WS WMFO OG LGDVS MFU WS MDLG NDMLLPCY POL LYEAGDL. WS CPFU OIS EGLO GNNQKKPFR LYEAGD MFU NIMFRS PO OG OIS CGKE GC OIS 'CPKLO' DSOOSK GC OIS HDMPFOSXO LMEHDS, OIS FSXO EGLO NGEEGF LYEAGD PL NIMFRSU OG OIS CGKE GC OIS 'LSNGFU' DSOOSK, MFU OIS CGDDGWPFR EGLO NGEEGF LYEAGD PL NIMFRSU OG OIS CGKE GC OIS 'OIPKU' DSOOSK, MFU LG GF, QFOPD WS MNNGQFO CGK MDD LYEAGDL GC OIS NKYHOGRKME WS WMFO OG LGDVS.  

#Analysis:  S->88 , O->80, G->67, F->51, D->42, L->39 (So on.....)  
#Plain text:  
#one way to solve an encrypted message, if we know its language, is to find a different plaintext of the same language long enough to fill one sheet or so, and then we count the occurrences of each letter. we call the most frequently occurring letter the 'first', the next most occurring letter the 'second' the following most occurring letter the 'third', and so on, until we account for all the different letters in the plaintext sample. then we look at the cipher text we want to solve and we also classify its symbols. we find the most occurring symbol and change it to the form of the 'first' letter of the plaintext sample, the next most common symbol is changed to the form of the 'second' letter, and the following most common symbol is changed to the form of the 'third' letter, and so on, until we account for all symbols of the cryptogram we want to solve.   
#Option:  1) Take replace rule  
#2) Exit  Option>   
#------------------------------------------------------------END----------------------------------------------------------------------------

