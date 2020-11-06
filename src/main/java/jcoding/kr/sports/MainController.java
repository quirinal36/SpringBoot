package jcoding.kr.sports;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class MainController {
  
  @RequestMapping("index")
  public ModelAndView home(ModelAndView mv) {
    BookUtil bookUtil = new BookUtil();
    List<BookInfo> list = bookUtil.getBookList("삼국지", "1", "", "");
    
    BookInfo book = new BookInfo();
    String[] authors = new String[1];
    authors[0] = "조조";
    book.setTitle("삼국지");
    book.setAuthors(authors);
    mv.addObject("book", book);
    mv.addObject("list", list);
    mv.setViewName("/hello");
    return mv;
  }
}
