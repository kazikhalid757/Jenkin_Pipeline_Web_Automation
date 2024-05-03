package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
    private WebDriver driver;

    public Homepage(WebDriver driver) {
        this.driver = driver;
    }



    By homepage = By.xpath("//header[@class='brand-banner css-1dw04nm e1uv6fgb6']");
    By signup = By.xpath("//a[@class='button--base button--primary internal-link']");
    By signpage = By.xpath("//a[@class='button--base button--primary button--fat internal-link']");
    By email = By.xpath("//input[@placeholder='Email']");
    By login_email = By.xpath("//input[@placeholder='Username or Email']");
    By name = By.xpath("//input[@placeholder='Full Name']");
    By pass = By.xpath("//input[@placeholder='Password']");

    By Continue = By.xpath("//button[contains(text(),'Continue')]");
    By Login = By.xpath("//a[@data-vars-button-name='main-nav-login']");
    By log = By.xpath("//button[normalize-space()='Log In']");
    By Login_p = By.xpath("//a[@class='button--base internal-link']");

    By newsletters = By.xpath("//a[@class='button--base button--no-left-padding button--no-right-padding internal-link']");
    By news_e_box = By.xpath("//input[@placeholder='Enter your email']");
    By subscribe = By.xpath("//button[@type='submit']");
    By point = By.xpath("//div[@class='email-subscriptions']//div//div[1]//div[1]//label[1]//div[1]");
    By search = By.xpath("//input[@placeholder='Search Flipboard']");

    By Profile = By.xpath("//button[@class='button--unstyled media-link']");
    By analytics = By.xpath("//a[@name='main-nav-analytics']");
    By settings = By.xpath("//a[@name='main-nav-settings']");
    By privacy = By.xpath("//a[@name='main-nav-privacy-policy']");
    By darkmode = By.xpath("//a[@name='profile-dropdown-toggle-theme']");
    By log_out = By.xpath("//a[@name='main-nav-logout']");
    By flip_button = By.xpath("//button[@data-vars-button-name='navbar-flip-compose']//div[@class='button--unstyled__children']//*[name()='svg']");
    By flip_box = By.xpath("//span[normalize-space()='Create a Flip']");
    By add_button = By.xpath("//button[normalize-space()='Add']");
    By followin_bu = By.xpath("//a[@class='css-6uyffl e1y6us0y0 internal-link']//*[name()='svg']");
    By Tab_All = By.xpath("//a[normalize-space()='All']");
    By Tab_video = By.xpath("//a[normalize-space()='Videos']");
    By like = By.xpath("//li[2]//div[1]//article[1]//footer[1]//div[1]//div[1]//div[1]//button[1]//*[name()='svg']");
    By comment = By.xpath("//li[1]//div[1]//article[1]//footer[1]//div[1]//div[2]//div[1]//button[1]//*[name()='svg']");
    By comment_box = By.xpath("//div[@id='placeholder-comment']");
    By post_but = By.xpath("//button[normalize-space()='Post']");
    By notification = By.xpath("//button[@class='button--unstyled css-zqid3 e1ep8s3m2']//div[@class='button--unstyled__children']//*[name()='svg']//*[name()='path' and contains(@fill-rule,'evenodd')]");
    By Social = By.xpath("//div[normalize-space()='Social']");
    By Content = By.xpath("//div[normalize-space()='Content']");
    By close = By.xpath("//button[@class='button--unstyled css-1sjtuu7 e5x1cmf3']//div[@class='button--unstyled__children']//*[name()='svg']");

    By profiletab = By.xpath("//span[contains(@class,'internal-link')]");
    By Social_Settings = By.xpath("//a[normalize-space()='Social Settings']");

    By share = By.xpath("//body/div[@class='css-0 ekumfqp0']/div[@id='content']/div[@class='app']/div/div[@class='page']/main[@class='home layout--main-unauthenticated e1v3hok70 main css-143lh6a erqhuse0']/div[@class='centered-column']/div[@class='home-feed']/ul[@class='item-list item-list--grid']/li[1]/div[1]/article[1]/footer[1]/div[1]/button[1]//*[name()='svg']");
    By facebook = By.xpath("//button[@class='button--with-badge--facebook button--with-badge--share button--with-badge--facebook--share no-text-transform button--base button--block button--with-badge css-bsz50z ea02pfk0']");
    By twitter = By.xpath("//button[@class='button--with-badge--twitter button--with-badge--share button--with-badge--twitter--share no-text-transform button--base button--block button--with-badge css-bsz50z ea02pfk0']");
    By cencel_s = By.xpath("//button[normalize-space()='Cancel']");
    By News = By.xpath("//a[normalize-space()='News']");
    By Entertainment = By.xpath("//a[normalize-space()='Entertainment']");
    By Technology = By.xpath("//a[normalize-space()='Technology']");
    By Travel = By.xpath("//a[normalize-space()='Travel']");
    By Food = By.xpath("//a[normalize-space()='Food']");
    By Sports = By.xpath("//a[normalize-space()='Sports']");
    By Flipboard = By.xpath("//a[normalize-space()='Flipboard TV']");





    public WebElement getsignup(){ return driver.findElement(signup);}
    public WebElement signup_page(){ return driver.findElement(signpage);}
    public WebElement gethomepage(){ return driver.findElement(homepage);}
    public WebElement geteamil(){ return driver.findElement(email);}
    public  WebElement get_login_email(){return driver.findElement(login_email);}
    public WebElement getname(){ return driver.findElement(name);}
    public WebElement getpass(){ return driver.findElement(pass);}
    public WebElement getContinue(){ return driver.findElement(Continue);}
    public WebElement getlogin() { return driver.findElement(Login);}
    public WebElement getlogin_p() { return driver.findElement(Login_p);}

    public WebElement  getnewsletters(){ return driver.findElement(newsletters);}
    public WebElement getnews_e_box() { return driver.findElement(news_e_box);}
    public WebElement getsubscribe() { return driver.findElement(subscribe);}

    public WebElement getpoint() { return driver.findElement(point);}
    public WebElement getsearch() { return driver.findElement(search);}
    public WebElement getProfile() { return driver.findElement(Profile);}
    public WebElement  getanalytics() { return driver.findElement(analytics);}
    public WebElement getsettings() { return driver.findElement(settings);}
    public WebElement getprivacy() { return driver.findElement(privacy);}
    public WebElement getdarkmode() { return driver.findElement(darkmode);}
    public WebElement getlog_out() { return driver.findElement(log_out);}
    public WebElement getflip_button() { return driver.findElement(flip_button);}
    public WebElement getflip_box() { return driver.findElement(flip_box);}
    public WebElement getadd_button() { return driver.findElement(add_button);}
    public WebElement getlog() { return driver.findElement(log);}
    public WebElement getfollowin_bu (){ return driver.findElement(followin_bu);}
    public WebElement gettaball(){ return driver.findElement(Tab_All);}
    public WebElement gettabvideo (){ return driver.findElement(Tab_video);}
    public WebElement getlike(){return driver.findElement(like);}

    public WebElement getcomment(){ return driver.findElement(comment);}
    public WebElement getcommentbox(){ return driver.findElement(comment_box);}
    public WebElement getpost(){ return driver.findElement(post_but);}
    public WebElement getnotification(){ return driver.findElement(notification);}
    public WebElement getSocial(){ return driver.findElement(Social);}
    public WebElement  getcontent(){ return driver.findElement(Content);}
    public WebElement  getclose(){ return driver.findElement(close);}

    public WebElement getprofile_tab() { return driver.findElement(profiletab);}
    public WebElement getsocial_tab(){ return driver.findElement(Social_Settings);}
    public WebElement getshere(){ return driver.findElement(share);}
    public WebElement getfacbook(){ return driver.findElement(facebook);}
    public WebElement gettwitter(){ return driver.findElement(twitter);}
    public WebElement getcencel(){ return driver.findElement(cencel_s);}
    public WebElement getnews(){ return driver.findElement(News);}
    public WebElement getENTERTAINMENT(){ return driver.findElement(Entertainment);}
    public WebElement getTechnology(){ return driver.findElement(Technology);}
    public WebElement getTravel(){ return driver.findElement(Travel);}
    public WebElement getFood(){ return driver.findElement(Food);}
    public WebElement getSports(){ return driver.findElement(Sports);}

    public WebElement getFlipboard(){ return driver.findElement(Flipboard);}



}