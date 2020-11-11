package study.errorcustomizetest.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class CustomErrorController implements ErrorController {

    @Override
    public String getErrorPath() {
        return "/error";
    }

    @GetMapping("/error")
    public String handleError(HttpServletRequest request, Model model) {
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        if (status != null) {
            int statusCode = Integer.parseInt(String.valueOf(status));
            HttpStatus httpStatus = HttpStatus.valueOf(statusCode);

            model.addAttribute("timestamp", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            model.addAttribute("status", httpStatus.value());
            model.addAttribute("message", httpStatus.getReasonPhrase());

            switch (httpStatus) {
                case NOT_FOUND:
                    return "errors/404";
                case INTERNAL_SERVER_ERROR:
                    return "errors/500";
            }
        }
        return "errors/customError";
    }
}
