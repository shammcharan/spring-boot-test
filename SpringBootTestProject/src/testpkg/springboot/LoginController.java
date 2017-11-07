package testpkg.springboot;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/testApp")
public class LoginController {

	@RequestMapping(method = RequestMethod.POST, value="/login")
	public void login(@RequestBody Credential credential) {
		System.out.println(credential.getPasswd());
		System.out.println(credential.getUserName());
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/login")
	public void getSomething(@RequestBody Credential credential) {
		System.out.println(credential.getPasswd());
		System.out.println(credential.getUserName());
	}
}
