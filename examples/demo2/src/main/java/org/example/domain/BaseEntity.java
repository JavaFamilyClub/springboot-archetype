package org.example.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Builder;
import lombok.Data;

@Data
@MappedSuperclass
@JsonIgnoreProperties(value = {"hibernateLazyInitializer"})
public abstract class BaseEntity implements Serializable {

   private static final long serialVersionUID = 1L;

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

   @Temporal(TemporalType.TIMESTAMP)
   @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
   @Builder.Default
   private Date createDate = new Date();

}
