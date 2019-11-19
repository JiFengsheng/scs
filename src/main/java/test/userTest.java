package test;

import com.scs.pojo.User;
import com.scs.service.IUserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class userTest {


    private IUserService service;
    @Before
    public void before(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("SpringMybatis.xml");
        service=(IUserService) ac.getBean("userService");
    }

//id, name, password, rfid, role, create_time, update_time, disabled
    /*增加测试*/
    @Test
    public void test01(){
        User user=new User("eee","123","666",1,false);
        service.addUser(user);
        System.out.println(user);
    }
    @Test
    public void test02(){
        User user=new User();
        user.setName("aaa");
        user.setPassword("111");
//        user.setRfid("222");
        user.setRole(1);
//        user.setDisabled(false);
        service.addUserSelective(user);
    }


//    查询测试
    @Test
    public void test03() throws ParseException {

        List<User> users = service.findAllUsers();
        System.out.println(users.get(1));


        /*时间处理*/
        /*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String ct = sdf.format(users.get(1).getCreateTime());
        System.out.println(ct);
        Date date1 = sdf.parse(ct);
        System.out.println(date1);*/
    }

    /*查询用户的数量*/
    @Test
    public void test04(){
        Long a = service.countUsers();
        System.out.println(a);
    }

    /*删除用户*/
    @Test
    public void test05(){
        service.removeById(6);
        List<User> users = service.findAllUsers();
        for(User user:users){
            System.out.println(user);
        }
    }
    /*任意性查询*/
    @Test
    public void test06(){
        User user=new User();
        user.setName("aa");
//        user.setPassword("111");
//        user.setRfid("222");
        user.setRole(1);
        List<User> users = service.selectByExample(user);
        for (User user1:users){
            System.out.println(user1);
        }

    }
    /*修改*/
    @Test
    public void test07(){
        User user=new User();
        user.setId(2);
        user.setName("cc");
        service.modifyUser(user);
    }

    /*通过id查询*/
    @Test
    public void test08(){
        User user = service.findUserById(3);
        System.out.println(user);
    }












}
