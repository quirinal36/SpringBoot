package jcoding.kr.sports;

import java.time.LocalDateTime;
import org.json.JSONArray;
import org.json.JSONObject;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BookInfo {
  private String title; // 도서 제목
  private String contents; // 도서 소개
  private String url;         // 도서 상세 URL
  private String isbn;        // 국제 표준 도서번호
  private LocalDateTime datetime; // 도서 출판날짜 [YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].000+[tz]
  private String[] authors;       // 도서 저자 리스트
  private String publisher;       // 도서 출판사
  private String[] translators;   // 도서 번역자 리스트
  private int price;              // 도서 정가
  private int sale_price;         // 도서 판매가
  private String thumbnail;       // 도서 표지 미리보기 URL
  private String status;          // 도서 판매 상태 정보 (정상, 품절, 절판 등)
}
