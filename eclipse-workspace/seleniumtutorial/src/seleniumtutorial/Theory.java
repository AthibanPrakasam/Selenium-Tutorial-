package seleniumtutorial;

public class Theory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Actions 
		 * 
		 * 
		 *  for cursor moveing , send keys , double click , drag & drop , hold 
		 *  its a class 
		 *  we use to create Object 
		 *  step 1 - findelement f
		 *  2 - Actions obj  = new Actions(driver)
		 *  3- obj.movetoelement(f).build().perform();
		 *  5.obj.Sendkeys(Keys.F5);
		 *  
		 * 
		 *
		 *Select class / method
		 *
		 *
		 *used to dropdown list 
		 *its a class  
		 *we create object 
		 *step1 - findelement f
		 *select obj = new (f)
		 *obj.selectbyvalue(""); or selectbyindex(); or selectbyVisibleText();
		 *
		 *
		 *
		 *Navigate commands 
		 *
		 *driver.navigate().back();
		 *driver.navigate().forward();
		 *driver.navigate().refresh();
		 *driver.navigate().to("link");
		 *
		 *
		 *Switch to 
		 *
		 *used for frames 
		 *
		 *step1 findelements for frame  f
		 * driver.switchto().frame(f).findelements(By.locators(" "));
		 * 
		 * 
		 * 
		 *      
		 * Take screen shot 
		 * 
		 *      using webdriver 
		 *      
		 *      save as png format 
		 *      
		 *      step 1 create file . takescreenshot . getscreenshot 
		 *      
		 *      File f = ((takescreenshot()driver).getscreenshot(Outputtype."FILE");
		 *      
		 *      Step 1 copy file to save in system folder 
		 *      
		 *      Files.copy =(f.new File(folderpath/"+driver.getTitle()+".png)) 
		 *      
		 *      
		 * ALERT msg in driver 
		 * 
		 *      Alert a = driver.switchto().alert();
		 *      a.dismiss();
		 *      
		 *      
		 *      
		 * Data Driven Testing 
		 * 
		 * 
		 *EXCEL
		 * 
		 *
		 *install JXL.jar file  or POI.jar file 
		 *save excel file as 
		 *
		 *Read Data into Excel
		 *
		 *step 1 . import the workbook by using Fileinputstream 
		 *
		 *Fileinputstream f = new fileinputstream ("location/FILENAME.XLS")
		 *
		 *step2 . open workbook by using get workbook
		 *
		 *workbook wb = workbook.getworkbook(f)
		 *      
		 * step3 . identify sheet of the workbook 
		 * 
		 *  Sheet s = wb.getsheet("name");
		 *  
		 * getcolum,getrow ,getcell(C,R),getcontent() 
		 * 
		 * 
		 * Writing Data into Excel 
		 * 
		 * used to write output in excel 
		 * 
		 * step1 create xls file using FileoutputStream 
		 * 
		 * FileoutputStream f = new Fileoutputstream( "location"/filename.xls");
		 * 
		 * step2 creating workbook 
		 * 
		 * writableworkbook wb = workbook.createworkbook(f);
		 * 
		 * 
		 * step3 creating sheet 
		 * 
		 * writablesheet s = wb.createsheet("name",1);
		 * 
		 * step4 creating cell by using Label class 
		 * 
		 * Label l = new Label(0,0,value);
		 * 
		 * add cell in sheet = s.addcell(l);
		 * 
		 * step5 
		 * 
		 * save and close worjkbook 
		 * 
		 * wb.write();
		 * wb.close();
		 * 
		 * 
		 * NOTEPAD 

 Read

Step1 . Creating file reader object  

FileReader f = new FileReader(“Location/name.txt”) 

Step2 . Open the notepad file by creating Bufferreader obj  

BuffeRedreader b= new BufferReader(f); 

 

Step3  Reading the data from notepad  

 

String s;  

While((s=b.readline())!!=null) 

{ 

Print s  

} 

Write  

 

Step1  

Create file writer  

FileWriter f = new FileWriter(“Location/name.txt”); 

Step2 : Bufferedwriter 

Bufferedwriter b = new Bufferedwriter(f); 

Step3: 

Write the notepad  

b.writer(“Hello Athiban”); 

Step4. 

Close the notepad 

b.close(); 

		 *
		 * Synchronization point 
		 * 
		 * timegap - explicit wait , implicit wait , webdrivberwait
		 * 
		 * explicit wait - irrespective of the applicatio 
		 * Thread sleep(ms);
		 * 
		 * implicit wait - availability of the element 
		 * driver.manage().timeout().implicitwait(secounds.timeunit());
		 * 
		 * webdriverwait - behaviour and availability of the element 
		 * 
		 * werbdriverwait obj = new webdriverwait(driver,Secounds);
		 * obj.until(ExpectedCondition.titlecontains(" ");
		 * 
		 * 
		 * Page Object Model 
		 * 
		 * 1- its a part of framework 
		 * 
		 * findelement in class and use that element multiple times by using that class 
		 * 
		 *  Byusing by class
		 *  By using webelement ( pagefactorymethod) 
		 *  
		 *  
		 * 
		 * @findto 
		 * 
		 * create in class 
		 * @findto(locator=" ")WebElement.reference 
		 * 
		 * call in main method 
		 * 
		 *classname . obj = pagefactory.initElements(driver.classname.class)
		 *
		 *by using obj we can handle that element multiple times with multiple method 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 *   
		 *      
		 *      
		 *      
		 *      
		 *      */
	}

}
