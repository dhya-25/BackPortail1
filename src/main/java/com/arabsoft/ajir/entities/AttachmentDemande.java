package com.arabsoft.ajir.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;

 
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

  
@Entity(name="ATTACHMENT_DEAMNDE")
@ToString
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AttachmentDemande {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqAttach")
    @SequenceGenerator(name = "seqAttach", sequenceName = "ATTACHMENT_DEMANDE_SEQ", allocationSize = 1)
	private Long id	;
    private LocalDateTime time;
    @Lob
	private byte[] data	;
	private String file_type;
	private String file_name;
	private Long id_demande	;
 
	

}
