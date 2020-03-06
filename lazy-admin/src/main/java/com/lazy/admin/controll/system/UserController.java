package com.lazy.admin.controll.system;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/user")
public class UserController {

    /*@Autowired
    private UserService userService;

    @Autowired
    DefaultKaptcha defaultKaptcha;



    @RequestMapping("/defaultKaptcha")
    public void dafaultKaptcha(HttpServletRequest request, HttpServletResponse response) throws IOException {
        byte[] captchaChallengeAsJpeg = null;
        ByteArrayOutputStream jpegOutputStream = new ByteArrayOutputStream();
        try {
            // 生产验证码字符串并保存到session中
            String createText = defaultKaptcha.createText();
            //request.getSession().setAttribute(ConstantVal.CHECK_CODE, createText);
            request.getSession().setAttribute("defaultKaptcha", createText);
            //Constant
            BufferedImage challenge = defaultKaptcha.createImage(createText);
            ImageIO.write(challenge, "jpg", jpegOutputStream);
        } catch (IllegalArgumentException e) {
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
            return;
        }
        captchaChallengeAsJpeg = jpegOutputStream.toByteArray();
        response.setHeader("Cache-Control", "no-store");
        response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType("image/jpeg");
        ServletOutputStream responseOutputStream = response.getOutputStream();
        responseOutputStream.write(captchaChallengeAsJpeg);
        responseOutputStream.flush();
        responseOutputStream.close();

    }*/
    @RequestMapping("/hello")
    public String login(){
        return "/login";
    }
    @RequestMapping("/authentication/form")
    public String test(String account,String password){
        if("zjm".equals(account)&&"zjm".equals(password)){
            return  "index";
        }
        return "login";

    }
}
