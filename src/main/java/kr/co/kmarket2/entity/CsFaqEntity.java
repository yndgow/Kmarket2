package kr.co.kmarket2.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "km_cs_faq")
public class CsFaqEntity {
	@Id
	private int no;
	private int cate1;
	private int cate2;
	private String title;
	private String content;
	private int hit;
	private String regip;
	@CreatedDate
	private LocalDateTime rdate;
}
