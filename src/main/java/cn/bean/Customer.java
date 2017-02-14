package cn.bean;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by ChenGeng on 2017/2/14.
 */
public class Customer extends BaseDomain {

    @Id
    @GenericGenerator(name = "PKUUID", strategy = "uuid2")
    @GeneratedValue(generator = "PKUUID")
    @Column(length = 36)
    protected String id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 最新电子邮件地址
     */
    private String newEmail;

    /**
     * 旧的、通过验证的电子邮件地址
     */
    private String oldEmail;

    /**
     * 加密盐
     */
    private String salt;

    /**
     * 加密后的密码
     */
    private String password;

    /**
     * 最新电子邮件地址是否验证通过的标志
     * 电子邮件在30分钟内通过验证后才可购票
     */
    private boolean isChecked;

    /**
     * 电子邮件发送时间
     */
    private Date sendMailTime;

    /**
     * 电子邮件发送的链接中编码，采用UUID
     */
    private String urlCode;

    /**
     * 密保问题
     */
    private String passwordQuestion;

    /**
     * 密保答案
     */
    private String passwordAnswer;

    /**
     * 手机号码
     */
    private String phoneNumber;

    /**
     * 短信验证码，6位
     */
    private String phoneCheckNumber;

    /**
     * 短信发送时间
     */
    private Date phoneSendTime;

    /**
     * 短信验证是否通过，如果未通过则1分钟只能发送一条短信
     */
    private boolean phoneIsChecked;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 身份证号码
     */
    private String idNumber;

    /**
     * 未使用的里程，可用于支付机票，每100旅程可用于支付1元
     */
    private Long remainedDistance;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNewEmail() {
        return newEmail;
    }

    public void setNewEmail(String newEmail) {
        this.newEmail = newEmail;
    }

    public String getOldEmail() {
        return oldEmail;
    }

    public void setOldEmail(String oldEmail) {
        this.oldEmail = oldEmail;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public Date getSendMailTime() {
        return sendMailTime;
    }

    public void setSendMailTime(Date sendMailTime) {
        this.sendMailTime = sendMailTime;
    }

    public String getUrlCode() {
        return urlCode;
    }

    public void setUrlCode(String urlCode) {
        this.urlCode = urlCode;
    }

    public String getPasswordQuestion() {
        return passwordQuestion;
    }

    public void setPasswordQuestion(String passwordQuestion) {
        this.passwordQuestion = passwordQuestion;
    }

    public String getPasswordAnswer() {
        return passwordAnswer;
    }

    public void setPasswordAnswer(String passwordAnswer) {
        this.passwordAnswer = passwordAnswer;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneCheckNumber() {
        return phoneCheckNumber;
    }

    public void setPhoneCheckNumber(String phoneCheckNumber) {
        this.phoneCheckNumber = phoneCheckNumber;
    }

    public Date getPhoneSendTime() {
        return phoneSendTime;
    }

    public void setPhoneSendTime(Date phoneSendTime) {
        this.phoneSendTime = phoneSendTime;
    }

    public boolean isPhoneIsChecked() {
        return phoneIsChecked;
    }

    public void setPhoneIsChecked(boolean phoneIsChecked) {
        this.phoneIsChecked = phoneIsChecked;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Long getRemainedDistance() {
        return remainedDistance;
    }

    public void setRemainedDistance(Long remainedDistance) {
        this.remainedDistance = remainedDistance;
    }
}
