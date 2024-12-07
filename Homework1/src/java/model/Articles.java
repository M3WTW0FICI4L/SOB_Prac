/**
 * @author ivans
 *  
 */
package model;

import java.util.Date;
import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
//import jakarta.validation.constraints.NotNull;
import jakarta.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Articles implements Serializable {
    @ManyToOne
    private User atricle_author;
    @Id
    @SequenceGenerator(name="Articles_gen", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Articles_gen")
    private Long atricle_id;
    private String atricle_title;
    private String atricle_topic;
    
    
    private String[] atricle_summary;
    private String[] atricle_text;
    private static short text_lenght;
    private static short summary_lenght;

    private String image_link;
    private Date publish_date;
    private int atricle_views;
    private boolean private_article;

    /**
    * @Constructor
    */
    public Articles(User atricle_author, String atricle_title, String atricle_topic, 
                    Long atricle_id, String[] atricle_summary, String[] atricle_text, 
                    int atricle_views, String image_link, Date publish_date, boolean private_article) {
        this.atricle_author = atricle_author;
        this.atricle_title = atricle_title;
        this.atricle_topic = atricle_topic;
        this.atricle_id = atricle_id;
        this.atricle_summary = atricle_summary;
        this.atricle_text = atricle_text;
        this.atricle_views = atricle_views;
        this.image_link = image_link;
        this.publish_date = publish_date;
        this.private_article = private_article;
    }

    /**
    * @Getters y 
    *   
    */
    public User getAtricle_author() {
        return atricle_author;
    }
    public void setAtricle_author(User atricle_author) {
        this.atricle_author = atricle_author;
    }
    
    public String getAtricle_title() {
        return atricle_title;
    }
    public void setAtricle_title(String atricle_title) {
        this.atricle_title = atricle_title;
    }

    public String getAtricle_topic() {
        return atricle_topic;
    }
    public void setAtricle_topic(String atricle_topic) {
        this.atricle_topic = atricle_topic;
    }

    public Long getAtricle_id() {
        return atricle_id;
    }
    public void setAtricle_id(Long atricle_id) {
        this.atricle_id = atricle_id;
    }

    public String[] getAtricle_summary() {
        return atricle_summary;
    }
    public void setAtricle_summary(String[] atricle_summary) {
        this.atricle_summary = atricle_summary;
    }

    public String[] getAtricle_text() {
        return atricle_text;
    }
    public void setAtricle_text(String[] atricle_text) {
        this.atricle_text = atricle_text;
    }

    public static short getText_lenght() {
        return text_lenght;
    }
    public static void setText_lenght(short text_lenght) {
        Articles.text_lenght = text_lenght;
    }

    public static short getSummary_lenght() {
        return summary_lenght;
    }
    public static void setSummary_lenght(short summary_lenght) {
        Articles.summary_lenght = summary_lenght;
    }

    public int getAtricle_views() {
        return atricle_views;
    }
    public void setAtricle_views(int atricle_views) {
        this.atricle_views = atricle_views;
    }

    public String getImage_link() {
        return image_link;
    }
    public void setImage_link(String image_link) {
        this.image_link = image_link;
    }

    public Date getPublish_date() {
        return publish_date;
    }
    public void setPublish_date(Date publish_date) {
        this.publish_date = publish_date;
    }

    public boolean isPrivate_article() {
        return private_article;
    }
    public void setPrivate_article(boolean private_article) {
        this.private_article = private_article;
    }
    
    /**
    * @Funcions implementades
    *   
    */
    
}
