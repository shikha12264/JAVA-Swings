import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
 
public class CV2 implements ActionListener {        
    public CV2() {
        Font font1 = new Font("Comic Sans MS", Font.BOLD, 40);
Font f4 = new Font("Roboto",Font.PLAIN,18);
Font f2 = new Font("Roboto",Font.PLAIN,24);
Font f3 = new Font("Forte",Font.BOLD,18);

JFrame f = new JFrame("Resume");
JLabel lname = new JLabel ("Curriculum Vitae");
lname.setBounds(10,0,500,80);
lname.setFont(font1);

JLabel lsd = new JLabel ("Personal Info");
lsd.setBounds(10,30,500,100);
lsd.setFont(f3);
f.add(lname);
f.add(lsd);

JLabel na=new JLabel("Name");  
na.setBounds(30,90,230,30);
na.setFont(f4);
na.setForeground(Color.BLACK);
f.add(na);

JTextField ta =new JTextField();
ta.setBounds(140,90,200,30);
f.add(ta);

JLabel ad=new JLabel("Address");  
ad.setBounds(30,130,230,30);
ad.setFont(f4);
ad.setForeground(Color.BLACK);
f.add(ad);

JTextField tad =new JTextField();
tad.setBounds(140,130,200,30);
f.add(tad);

JLabel l8=new JLabel("Phone No. ");  
l8.setBounds(30,170, 230,30);
l8.setFont(f4);
l8.setForeground(Color.BLACK);
f.add(l8); 

String codes[] = { "+91 (IN) ","+444 (UK)", "+1 (US)" ,
" +971 (UAE)"};
JComboBox t8 = new JComboBox(codes);
t8.setFont(new Font("Arial", Font.PLAIN, 15));          
t8.setBounds(140,170,90,30);
f.add(t8);

JTextField t8n = new JTextField();
t8n.setBounds(230,170,150,30);
f.add(t8n);

JLabel  l4=new JLabel("Date of Birth");  
l4.setBounds(30,210,230,30);
l4.setFont(f4);
l4.setForeground(Color.BLACK);
f.add(l4);

String dates[] = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
String months[] = { "Jan", "Feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };
String years[] = { "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019" };
 
        JComboBox date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));        
        date.setBounds(140,210,50,30);
        f.add(date);

        JComboBox month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setBounds(190,210,80,30);    
        f.add(month);
 
        JComboBox year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setBounds(270,210,80,30);        
        f.add(year);

JLabel l6=new JLabel("Gender");  
l6.setBounds(30,235,230,80);
l6.setFont(f4);
l6.setForeground(Color.BLACK);
f.add(l6); 

JRadioButton r1 = new JRadioButton("A Male");
JRadioButton r2 = new JRadioButton("B Female");
r1.setBounds(140,250,100,30);
r2.setBounds(250,250,120,30);
r1.setFont(f4);
r2.setFont(f4);
ButtonGroup bg=new ButtonGroup();
bg.add(r1); bg.add(r2);
f.add(r1); f.add(r2);

JLabel l7=new JLabel("Email ");  
l7.setBounds(30,290,230,30);
l7.setFont(f4);
l7.setForeground(Color.BLACK);
f.add(l7);

JTextField t7=new JTextField();
t7.setBounds(140,290,200,30);
f.add(t7);

JLabel c3=new JLabel("State");  
c3.setBounds(30,330,230,30);
c3.setFont(f4);
c3.setForeground(Color.BLACK);
f.add(c3); 
JTextField ct3=new JTextField();
ct3.setBounds(140,330,190,30);
f.add(ct3);

JLabel lex = new JLabel ("Work Experience");
lex.setBounds(10,330,500,100);
lex.setFont(f3);
f.add(lex);

JLabel org=new JLabel("Organization ");  
org.setBounds(30,390,230,30);
org.setFont(f4);
org.setForeground(Color.BLACK);
f.add(org);

JTextField torg=new JTextField();
torg.setBounds(140,390,200,30);
f.add(torg);

JLabel lwork=new JLabel("Work Location");  
lwork.setBounds(30,430,230,30);
lwork.setFont(f4);
lwork.setForeground(Color.BLACK);
f.add(lwork);

JTextField tlwork=new JTextField();
tlwork.setBounds(150,430,200,30);
f.add(tlwork);

JLabel c1=new JLabel("Department ");  
c1.setBounds(30,480,230,30);  
c1.setFont(f4);
c1.setForeground(Color.BLACK);
f.add(c1);

String country[]={"Choose option","Software Testing Department","Accounting and Finance","Human Resource Management","Marketing"};        
JComboBox cb = new JComboBox(country);    
cb.setBounds(140,480,190,30);    
f.add(cb);  

JLabel c2=new JLabel("Designation");  
c2.setBounds(30,530,230,30);
c2.setFont(f4);
c2.setForeground(Color.BLACK);
f.add(c2); 

String post[]={"Choose option","Senior Manager","Employee","HR","Manager","Sales Executive"};        
JComboBox ct2 = new JComboBox(post);    
ct2.setBounds(140,530,190,30);    
f.add(ct2);

JLabel  ll4=new JLabel("Start Date ");  
ll4.setBounds(30,570,230,30);
ll4.setFont(f4);
ll4.setForeground(Color.BLACK);
f.add(ll4);

JLabel  le4=new JLabel("End Date");  
le4.setBounds(30,630,230,30);
le4.setFont(f4);
le4.setForeground(Color.BLACK);
f.add(le4);

JComboBox dsd = new JComboBox(dates);
        dsd.setFont(new Font("Arial", Font.PLAIN, 15));        
        dsd.setBounds(140,570,50,30);
        f.add(dsd);

        JComboBox msd = new JComboBox(months);
        msd.setFont(new Font("Arial", Font.PLAIN, 15));
        msd.setBounds(190,570,80,30);    
        f.add(msd);
 
        JComboBox ysd = new JComboBox(years);
        ysd.setFont(new Font("Arial", Font.PLAIN, 15));
        ysd.setBounds(270,570,80,30);        
        f.add(ysd);


JComboBox esd = new JComboBox(dates);
        esd.setFont(new Font("Arial", Font.PLAIN, 15));        
        esd.setBounds(140,630,50,30);
        f.add(esd);

        JComboBox med = new JComboBox(months);
        med.setFont(new Font("Arial", Font.PLAIN, 15));
        med.setBounds(190,630,80,30);    
        f.add(med);
 
        JComboBox yed = new JComboBox(years);
        yed.setFont(new Font("Arial", Font.PLAIN, 15));
        yed.setBounds(270,630,80,30);        
        f.add(yed);
JLabel le = new JLabel ("Education");
le.setBounds(410,20,500,100);
le.setFont(f3);
f.add(le);

JLabel g6=new JLabel("Graduation");  
g6.setBounds(430,60,230,80);
g6.setFont(f4);
g6.setForeground(Color.BLACK);
f.add(g6); 

JRadioButton rg1 = new JRadioButton("Pursuing");
JRadioButton rg2 = new JRadioButton("Completed");
rg1.setBounds(540,80,100,30);
rg2.setBounds(650,80,120,30);
rg1.setFont(f4);
rg2.setFont(f4);
ButtonGroup bgg=new ButtonGroup();
bgg.add(rg1); bgg.add(rg2);
f.add(rg1); f.add(rg2);

JLabel collg=new JLabel("College/School ");  
collg.setBounds(430,120,230,30);
collg.setFont(f4);
collg.setForeground(Color.BLACK);
f.add(collg);

JTextField tcollg=new JTextField();
tcollg.setBounds(580,120,200,30);
f.add(tcollg);


JLabel  lsy=new JLabel("Start Year ");  
 lsy.setBounds(430,160,230,30);
 lsy.setFont(f4);
 lsy.setForeground(Color.BLACK);
f.add(lsy);

JLabel  ley=new JLabel("End Year");  
ley.setBounds(625,160,230,30);
ley.setFont(f4);
ley.setForeground(Color.BLACK);
f.add(ley);

        JComboBox ysy = new JComboBox(years);
        ysy.setFont(new Font("Arial", Font.PLAIN, 15));
        ysy.setBounds(520,160,70,30);        
        f.add(ysy);

        JComboBox yey = new JComboBox(years);
        yey.setFont(new Font("Arial", Font.PLAIN, 15));
        yey.setBounds(710,160,70,30);        
        f.add(yey);

JLabel deg=new JLabel("Degree");  
deg.setBounds(430,200,230,30);
deg.setFont(f4);
deg.setForeground(Color.BLACK);
f.add(deg);

JTextField tdeg=new JTextField();
tdeg.setBounds(510,200,200,30);
f.add(tdeg);

JLabel stre=new JLabel("Stream");  
stre.setBounds(430,240,230,30);
stre.setFont(f4);
stre.setForeground(Color.BLACK);
f.add(stre);

JTextField tstre=new JTextField();
tstre.setBounds(510,240,200,30);
f.add(tstre);

JLabel per=new JLabel("Performance (CGPA)");  
per.setBounds(430,280,230,30);
per.setFont(f4);
per.setForeground(Color.BLACK);
f.add(per);

JTextField tper=new JTextField();
tper.setBounds(610,280,150,30);
f.add(tper);

JLabel lski = new JLabel ("Skills");
lski.setBounds(410,300,500,100);
lski.setFont(f3);
f.add(lski);

JLabel ask=new JLabel("Add skills");  
ask.setBounds(430,360,230,30);
ask.setFont(f4);
ask.setForeground(Color.BLACK);
f.add(ask);

JTextField task=new JTextField();
task.setBounds(510,360,180,30);
f.add(task);

JLabel lcour = new JLabel ("Trainings/ Courses");
lcour.setBounds(410,360,500,100);
lcour.setFont(f3);
f.add(lcour);

JLabel cnam=new JLabel("Course name");  
cnam.setBounds(430,420,230,30);
cnam.setFont(f4);
cnam.setForeground(Color.BLACK);
f.add(cnam);

JTextField tcnam=new JTextField();
tcnam.setBounds(540,420,180,30);
f.add(tcnam);

JLabel cdes=new JLabel("Certification(URL)");  
cdes.setBounds(430,470,230,30);
cdes.setFont(f4);
cdes.setForeground(Color.BLACK);
f.add(cdes);

JTextField tcdes=new JTextField();
tcdes.setBounds(580,470,180,30);
f.add(tcdes);

JLabel acad = new JLabel ("Academics/Projects");
acad.setBounds(410,475,500,100);
acad.setFont(f3);
f.add(acad);

JLabel pdesc=new JLabel("Description");  
pdesc.setBounds(430,540,230,30);
pdesc.setFont(f4);
pdesc.setForeground(Color.BLACK);
f.add(pdesc);

JTextField tpdesc=new JTextField();
tpdesc.setBounds(540,540,180,30);
f.add(tpdesc);

JLabel pro=new JLabel("Project Link");  
pro.setBounds(430,580,230,30);
pro.setFont(f4);
pro.setForeground(Color.BLACK);
f.add(pro);

JTextField tpro=new JTextField();
tpro.setBounds(540,580,180,30);
f.add(tpro);

JLabel lpo = new JLabel ("Portfolio/Work Samples");
lpo.setBounds(830,200,500,100);
lpo.setFont(f3);
f.add(lpo);

JLabel blog=new JLabel("Blog Link");  
blog.setBounds(830,270,230,30);
blog.setFont(f4);
blog.setForeground(Color.BLACK);
f.add(blog);

JLabel iblog=new JLabel("(If any)");  
iblog.setBounds(830,290,230,30);
iblog.setFont(f4);
iblog.setForeground(Color.BLACK);
f.add(iblog);

JTextField tblog=new JTextField();
tblog.setBounds(930,280,180,30);
f.add(tblog);

JLabel port=new JLabel("Other Portfolio");  
port.setBounds(830,330,230,30);
port.setFont(f4);
port.setForeground(Color.BLACK);
f.add(port);
JLabel vblog=new JLabel("Links");  
vblog.setBounds(835,345,230,30);
vblog.setFont(f4);
vblog.setForeground(Color.BLACK);
f.add(vblog);

JTextField tport=new JTextField();
tport.setBounds(950,330,180,30);
f.add(tport);


JLabel acc = new JLabel ("Accomplishments/");
acc.setBounds(830,360,500,100);
acc.setFont(f3);
f.add(acc);

JLabel ladd = new JLabel ("Additional Details");
ladd.setBounds(830,380,500,100);
ladd.setFont(f3);
f.add(ladd);

JLabel wor=new JLabel("Workshops Attended");  
wor.setBounds(830,445,230,30);
wor.setFont(f4);
wor.setForeground(Color.BLACK);
f.add(wor);

JTextField twor=new JTextField();
twor.setBounds(1000,450,180,30);
f.add(twor);

JLabel cer=new JLabel("Certifications");  
cer.setBounds(830,485,230,30);
cer.setFont(f4);
cer.setForeground(Color.BLACK);
f.add(cer);

JTextField tcer=new JTextField();
tcer.setBounds(1000,490,180,30);
f.add(tcer);

JLabel side;
ImageIcon img = new ImageIcon("Capture.PNG");
side = new JLabel("",img,JLabel.CENTER);
side.setBounds(0,0,1400,700);
f.add(side);



        JButton update = new JButton("Submit");
        update.setBounds(790,600,150,40);
        update.setForeground(Color.BLACK);
        update.setFont(new java.awt.Font("Roboto", Font.PLAIN, 15));              
        f.add(update);
        
        update.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event)
            {
                        JOptionPane.showMessageDialog(null,"Submitted Successfully!");
                        
                    }
                }
            
    );
       
        JButton clear = new JButton("Clear");
        clear.setBounds(990,600,150,40);
        clear.setForeground(Color.BLACK);
        
        clear.setFont(new java.awt.Font("Roboto", Font.PLAIN, 15));                
        f.add(clear);
 
        clear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                int YesOrNo= JOptionPane.showConfirmDialog(null, "Are you sure you want to clear data?","Clear data", JOptionPane.YES_NO_OPTION);
                if(YesOrNo == 0){
	ta.setText("");
	tad.setText("");
	t8.setSelectedIndex(0);
	t8n.setText("");
	date.setSelectedIndex(0);
	month.setSelectedIndex(0);
	year.setSelectedIndex(0);
	t7.setText("");
	ct3.setText("");    
     
	cb.setSelectedIndex(0);
	ct2.setSelectedIndex(0);

	torg.setText("");
            	tlwork.setText("");

	dsd.setSelectedIndex(0);
	msd.setSelectedIndex(0);
	ysd.setSelectedIndex(0);

	esd.setSelectedIndex(0);
	med.setSelectedIndex(0);
	yed.setSelectedIndex(0);

	r1.setSelected(false);
	r2.setSelected(false);      
	rg1.setSelected(false);
	rg2.setSelected(false);
	ysy.setSelectedIndex(0);
	yey.setSelectedIndex(0);
	tcollg.setText("");    
            	tdeg.setText("");
                tstre.setText("");
                tper.setText("");
	task.setText("");
                tcnam.setText("");    
                tcdes.setText("");
	tpdesc.setText("");
	tpro.setText("");
	tblog.setText("");
	tport.setText("");
	twor.setText("");
	tcer.setText("");
	 }
            }
        });      
 
        
        
 
        f.setTitle("Resume");
        f.setSize(1400,700);
        f.setBackground(Color.WHITE);
        f.setLayout(null);
        f.setVisible(true);
        
    }
 
  

 
    public static void main(String[] args) {
        new CV2();
    }
 
    public void actionPerformed(ActionEvent e) {
        
    }
}
