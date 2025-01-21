import com.zmg.book.mapper.UserMapper;
import com.zmg.book.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class HelloTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectById() {
        User user = userMapper.selectById(1L); // 假设数据库中有id为1的用户
        assertNotNull(user, "User should not be null");
        System.out.println("User: " + user.getName());
    }
}