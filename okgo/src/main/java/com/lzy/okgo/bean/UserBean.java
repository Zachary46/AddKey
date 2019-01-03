package com.lzy.okgo.bean;

import java.io.Serializable;

public class UserBean implements Serializable {

    /**
     * UserAccount : {"UserInfo":{"UserId":7,"Wechat":null,"Nickname":"加盟拓展部","Avatar":"/Upload/All/20170830/1708301954355554884.jpg","Age":0,"AddressId":0,"Sex":3,"SexFriendName":"未知"},"UserRank":{"Id":1,"RankName":"加盟-合作中","Sort":0},"UserRole":{"Id":7,"Title":"公司\u2014超级管理员","IsSystem":false,"Permissions":"{\"Name\":\"公司\u2014超级管理员\",\"Modules\":[{\"Id\":\"1\",\"Name\":\"商品模块\",\"Items\":[{\"Name\":\"商品管理\",\"ControllerName\":\"Product\",\"ActionName\":\"Index,GetPage\"},{\"Name\":\"添加商品\",\"ControllerName\":\"Product\",\"ActionName\":\"Create\"},{\"Name\":\"更新商品\",\"ControllerName\":\"Product\",\"ActionName\":\"Update\"},{\"Name\":\"删除商品\",\"ControllerName\":\"Product\",\"ActionName\":\"Remove\"},{\"Name\":\"订单管理\",\"ControllerName\":\"Order\",\"ActionName\":\"Index,GetPage\"}]},{\"Id\":\"2\",\"Name\":\"用户模块\",\"Items\":[{\"Name\":\"用户管理\",\"ControllerName\":\"User\",\"ActionName\":\"Index,GetPage\"},{\"Name\":\"添加用户\",\"ControllerName\":\"User\",\"ActionName\":\"Create\"},{\"Name\":\"更新用户\",\"ControllerName\":\"User\",\"ActionName\":\"Update\"},{\"Name\":\"删除用户\",\"ControllerName\":\"User\",\"ActionName\":\"Remove\"},{\"Name\":\"类型管理\",\"ControllerName\":\"UserRank\",\"ActionName\":\"Index,GetPage\"},{\"Name\":\"添加类型\",\"ControllerName\":\"UserRank\",\"ActionName\":\"Create\"},{\"Name\":\"更新类型\",\"ControllerName\":\"UserRank\",\"ActionName\":\"Update\"},{\"Name\":\"删除类型\",\"ControllerName\":\"UserRank\",\"ActionName\":\"Remove\"}]},{\"Id\":\"3\",\"Name\":\"广告模块\",\"Items\":[{\"Name\":\"商城首页\",\"ControllerName\":\"Adv\",\"ActionName\":\"ShopHome,Create,Update,Edit,Remove\"},{\"Name\":\"热门精选\",\"ControllerName\":\"Adv\",\"ActionName\":\"Hot,Create,Update,Edit,Remove\"}]},{\"Id\":\"4\",\"Name\":\"资讯模块\",\"Items\":[{\"Name\":\"资讯管理\",\"ControllerName\":\"Info\",\"ActionName\":\"Index,GetPage\"},{\"Name\":\"添加资讯\",\"ControllerName\":\"Info\",\"ActionName\":\"Create\"},{\"Name\":\"更新资讯\",\"ControllerName\":\"Info\",\"ActionName\":\"Update\"},{\"Name\":\"删除资讯\",\"ControllerName\":\"Info\",\"ActionName\":\"Remove\"}]},{\"Id\":\"5\",\"Name\":\"分类模块\",\"Items\":[{\"Name\":\"分类管理\",\"ControllerName\":\"Category\",\"ActionName\":\"Index,Shop,Info,GetTreeView\"},{\"Name\":\"添加分类\",\"ControllerName\":\"Category\",\"ActionName\":\"Create\"},{\"Name\":\"更新分类\",\"ControllerName\":\"Category\",\"ActionName\":\"Update\"},{\"Name\":\"删除分类\",\"ControllerName\":\"Category\",\"ActionName\":\"Remove\"}]},{\"Id\":\"6\",\"Name\":\"财务模块\",\"Items\":[{\"Name\":\"钱包历史记录\",\"ControllerName\":\"UserWallet\",\"ActionName\":\"Histories\"},{\"Name\":\"充值/还款记录\",\"ControllerName\":\"UserWallet\",\"ActionName\":\"Orders\"}]},{\"Id\":\"7\",\"Name\":\"系统设置\",\"Items\":[{\"Name\":\"应用设置\",\"ControllerName\":\"Config\",\"ActionName\":\"Application\"},{\"Name\":\"个推设置\",\"ControllerName\":\"Config\",\"ActionName\":\"GeTui\"},{\"Name\":\"支付宝设置\",\"ControllerName\":\"Config\",\"ActionName\":\"Alipay\"},{\"Name\":\"微信设置\",\"ControllerName\":\"Config\",\"ActionName\":\"WechatPay\"},{\"Name\":\"管理员管理\",\"ControllerName\":\"Administrator\",\"ActionName\":\"*\"},{\"Name\":\"权限管理\",\"ControllerName\":\"UserRole\",\"ActionName\":\"*\"}]}]}"},"UserWallet":{"UserId":7,"UserBalance":0.1,"Credits":0,"BaseCredits":0,"Bounds":0,"UserLockBalance":0},"UserId":7,"Username":"郑南征","Mobile":"18605923123","Email":"","Password":"******","Salt":"******","Star":0,"LastLoginAt":"/Date(1509076110987)/","LastLoginIP":"127.0.0.1","Created":"/Date(1503968252000)/","Updated":"/Date(1503968252000)/","RoleId":7,"RankId":1,"Status":1,"StatusFriendName":"使用中","LastLoginAtFormated":"2017-10-27 11:48:30","CreatedFromated":"2017-08-29 08:57:32","UpdatedFormated":"2017-08-29 08:57:32"}
     * UserInfo : {"UserId":7,"Wechat":null,"Nickname":"加盟拓展部","Avatar":"/Upload/All/20170830/1708301954355554884.jpg","Age":0,"AddressId":0,"Sex":3,"SexFriendName":"未知"}
     * UserWallet : {"UserId":7,"UserBalance":0.1,"Credits":0,"BaseCredits":0,"Bounds":0,"UserLockBalance":0}
     * UserRole : {"Id":7,"Title":"公司\u2014超级管理员","IsSystem":false,"Permissions":"{\"Name\":\"公司\u2014超级管理员\",\"Modules\":[{\"Id\":\"1\",\"Name\":\"商品模块\",\"Items\":[{\"Name\":\"商品管理\",\"ControllerName\":\"Product\",\"ActionName\":\"Index,GetPage\"},{\"Name\":\"添加商品\",\"ControllerName\":\"Product\",\"ActionName\":\"Create\"},{\"Name\":\"更新商品\",\"ControllerName\":\"Product\",\"ActionName\":\"Update\"},{\"Name\":\"删除商品\",\"ControllerName\":\"Product\",\"ActionName\":\"Remove\"},{\"Name\":\"订单管理\",\"ControllerName\":\"Order\",\"ActionName\":\"Index,GetPage\"}]},{\"Id\":\"2\",\"Name\":\"用户模块\",\"Items\":[{\"Name\":\"用户管理\",\"ControllerName\":\"User\",\"ActionName\":\"Index,GetPage\"},{\"Name\":\"添加用户\",\"ControllerName\":\"User\",\"ActionName\":\"Create\"},{\"Name\":\"更新用户\",\"ControllerName\":\"User\",\"ActionName\":\"Update\"},{\"Name\":\"删除用户\",\"ControllerName\":\"User\",\"ActionName\":\"Remove\"},{\"Name\":\"类型管理\",\"ControllerName\":\"UserRank\",\"ActionName\":\"Index,GetPage\"},{\"Name\":\"添加类型\",\"ControllerName\":\"UserRank\",\"ActionName\":\"Create\"},{\"Name\":\"更新类型\",\"ControllerName\":\"UserRank\",\"ActionName\":\"Update\"},{\"Name\":\"删除类型\",\"ControllerName\":\"UserRank\",\"ActionName\":\"Remove\"}]},{\"Id\":\"3\",\"Name\":\"广告模块\",\"Items\":[{\"Name\":\"商城首页\",\"ControllerName\":\"Adv\",\"ActionName\":\"ShopHome,Create,Update,Edit,Remove\"},{\"Name\":\"热门精选\",\"ControllerName\":\"Adv\",\"ActionName\":\"Hot,Create,Update,Edit,Remove\"}]},{\"Id\":\"4\",\"Name\":\"资讯模块\",\"Items\":[{\"Name\":\"资讯管理\",\"ControllerName\":\"Info\",\"ActionName\":\"Index,GetPage\"},{\"Name\":\"添加资讯\",\"ControllerName\":\"Info\",\"ActionName\":\"Create\"},{\"Name\":\"更新资讯\",\"ControllerName\":\"Info\",\"ActionName\":\"Update\"},{\"Name\":\"删除资讯\",\"ControllerName\":\"Info\",\"ActionName\":\"Remove\"}]},{\"Id\":\"5\",\"Name\":\"分类模块\",\"Items\":[{\"Name\":\"分类管理\",\"ControllerName\":\"Category\",\"ActionName\":\"Index,Shop,Info,GetTreeView\"},{\"Name\":\"添加分类\",\"ControllerName\":\"Category\",\"ActionName\":\"Create\"},{\"Name\":\"更新分类\",\"ControllerName\":\"Category\",\"ActionName\":\"Update\"},{\"Name\":\"删除分类\",\"ControllerName\":\"Category\",\"ActionName\":\"Remove\"}]},{\"Id\":\"6\",\"Name\":\"财务模块\",\"Items\":[{\"Name\":\"钱包历史记录\",\"ControllerName\":\"UserWallet\",\"ActionName\":\"Histories\"},{\"Name\":\"充值/还款记录\",\"ControllerName\":\"UserWallet\",\"ActionName\":\"Orders\"}]},{\"Id\":\"7\",\"Name\":\"系统设置\",\"Items\":[{\"Name\":\"应用设置\",\"ControllerName\":\"Config\",\"ActionName\":\"Application\"},{\"Name\":\"个推设置\",\"ControllerName\":\"Config\",\"ActionName\":\"GeTui\"},{\"Name\":\"支付宝设置\",\"ControllerName\":\"Config\",\"ActionName\":\"Alipay\"},{\"Name\":\"微信设置\",\"ControllerName\":\"Config\",\"ActionName\":\"WechatPay\"},{\"Name\":\"管理员管理\",\"ControllerName\":\"Administrator\",\"ActionName\":\"*\"},{\"Name\":\"权限管理\",\"ControllerName\":\"UserRole\",\"ActionName\":\"*\"}]}]}"}
     * SessionId : 01f2f9eb1c1d446d92dc72b1b296ac32
     */

    private UserAccountBean UserAccount;
    private UserInfoBeanX UserInfo;
    private UserWalletBeanX UserWallet;
    private UserRoleBeanX UserRole;
    private String SessionId;

    public UserAccountBean getUserAccount() {
        return UserAccount;
    }

    public void setUserAccount(UserAccountBean UserAccount) {
        this.UserAccount = UserAccount;
    }

    public UserInfoBeanX getUserInfo() {
        return UserInfo;
    }

    public void setUserInfo(UserInfoBeanX UserInfo) {
        this.UserInfo = UserInfo;
    }

    public UserWalletBeanX getUserWallet() {
        return UserWallet;
    }

    public void setUserWallet(UserWalletBeanX UserWallet) {
        this.UserWallet = UserWallet;
    }

    public UserRoleBeanX getUserRole() {
        return UserRole;
    }

    public void setUserRole(UserRoleBeanX UserRole) {
        this.UserRole = UserRole;
    }

    public String getSessionId() {
        return SessionId;
    }

    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    public static class UserAccountBean {
        /**
         * UserInfo : {"UserId":7,"Wechat":null,"Nickname":"加盟拓展部","Avatar":"/Upload/All/20170830/1708301954355554884.jpg","Age":0,"AddressId":0,"Sex":3,"SexFriendName":"未知"}
         * UserRank : {"Id":1,"RankName":"加盟-合作中","Sort":0}
         * UserRole : {"Id":7,"Title":"公司\u2014超级管理员","IsSystem":false,"Permissions":"{\"Name\":\"公司\u2014超级管理员\",\"Modules\":[{\"Id\":\"1\",\"Name\":\"商品模块\",\"Items\":[{\"Name\":\"商品管理\",\"ControllerName\":\"Product\",\"ActionName\":\"Index,GetPage\"},{\"Name\":\"添加商品\",\"ControllerName\":\"Product\",\"ActionName\":\"Create\"},{\"Name\":\"更新商品\",\"ControllerName\":\"Product\",\"ActionName\":\"Update\"},{\"Name\":\"删除商品\",\"ControllerName\":\"Product\",\"ActionName\":\"Remove\"},{\"Name\":\"订单管理\",\"ControllerName\":\"Order\",\"ActionName\":\"Index,GetPage\"}]},{\"Id\":\"2\",\"Name\":\"用户模块\",\"Items\":[{\"Name\":\"用户管理\",\"ControllerName\":\"User\",\"ActionName\":\"Index,GetPage\"},{\"Name\":\"添加用户\",\"ControllerName\":\"User\",\"ActionName\":\"Create\"},{\"Name\":\"更新用户\",\"ControllerName\":\"User\",\"ActionName\":\"Update\"},{\"Name\":\"删除用户\",\"ControllerName\":\"User\",\"ActionName\":\"Remove\"},{\"Name\":\"类型管理\",\"ControllerName\":\"UserRank\",\"ActionName\":\"Index,GetPage\"},{\"Name\":\"添加类型\",\"ControllerName\":\"UserRank\",\"ActionName\":\"Create\"},{\"Name\":\"更新类型\",\"ControllerName\":\"UserRank\",\"ActionName\":\"Update\"},{\"Name\":\"删除类型\",\"ControllerName\":\"UserRank\",\"ActionName\":\"Remove\"}]},{\"Id\":\"3\",\"Name\":\"广告模块\",\"Items\":[{\"Name\":\"商城首页\",\"ControllerName\":\"Adv\",\"ActionName\":\"ShopHome,Create,Update,Edit,Remove\"},{\"Name\":\"热门精选\",\"ControllerName\":\"Adv\",\"ActionName\":\"Hot,Create,Update,Edit,Remove\"}]},{\"Id\":\"4\",\"Name\":\"资讯模块\",\"Items\":[{\"Name\":\"资讯管理\",\"ControllerName\":\"Info\",\"ActionName\":\"Index,GetPage\"},{\"Name\":\"添加资讯\",\"ControllerName\":\"Info\",\"ActionName\":\"Create\"},{\"Name\":\"更新资讯\",\"ControllerName\":\"Info\",\"ActionName\":\"Update\"},{\"Name\":\"删除资讯\",\"ControllerName\":\"Info\",\"ActionName\":\"Remove\"}]},{\"Id\":\"5\",\"Name\":\"分类模块\",\"Items\":[{\"Name\":\"分类管理\",\"ControllerName\":\"Category\",\"ActionName\":\"Index,Shop,Info,GetTreeView\"},{\"Name\":\"添加分类\",\"ControllerName\":\"Category\",\"ActionName\":\"Create\"},{\"Name\":\"更新分类\",\"ControllerName\":\"Category\",\"ActionName\":\"Update\"},{\"Name\":\"删除分类\",\"ControllerName\":\"Category\",\"ActionName\":\"Remove\"}]},{\"Id\":\"6\",\"Name\":\"财务模块\",\"Items\":[{\"Name\":\"钱包历史记录\",\"ControllerName\":\"UserWallet\",\"ActionName\":\"Histories\"},{\"Name\":\"充值/还款记录\",\"ControllerName\":\"UserWallet\",\"ActionName\":\"Orders\"}]},{\"Id\":\"7\",\"Name\":\"系统设置\",\"Items\":[{\"Name\":\"应用设置\",\"ControllerName\":\"Config\",\"ActionName\":\"Application\"},{\"Name\":\"个推设置\",\"ControllerName\":\"Config\",\"ActionName\":\"GeTui\"},{\"Name\":\"支付宝设置\",\"ControllerName\":\"Config\",\"ActionName\":\"Alipay\"},{\"Name\":\"微信设置\",\"ControllerName\":\"Config\",\"ActionName\":\"WechatPay\"},{\"Name\":\"管理员管理\",\"ControllerName\":\"Administrator\",\"ActionName\":\"*\"},{\"Name\":\"权限管理\",\"ControllerName\":\"UserRole\",\"ActionName\":\"*\"}]}]}"}
         * UserWallet : {"UserId":7,"UserBalance":0.1,"Credits":0,"BaseCredits":0,"Bounds":0,"UserLockBalance":0}
         * UserId : 7
         * Username : 郑南征
         * Mobile : 18605923123
         * Email :
         * Password : ******
         * Salt : ******
         * Star : 0
         * LastLoginAt : /Date(1509076110987)/
         * LastLoginIP : 127.0.0.1
         * Created : /Date(1503968252000)/
         * Updated : /Date(1503968252000)/
         * RoleId : 7
         * RankId : 1
         * Status : 1
         * StatusFriendName : 使用中
         * LastLoginAtFormated : 2017-10-27 11:48:30
         * CreatedFromated : 2017-08-29 08:57:32
         * UpdatedFormated : 2017-08-29 08:57:32
         */

        private UserInfoBean UserInfo;
        private UserRankBean UserRank;
        private UserRoleBean UserRole;
        private UserWalletBean UserWallet;
        private int UserId;
        private String Username;
        private String Mobile;
        private String Email;
        private String Password;
        private String Salt;
        private int Star;
        private String LastLoginAt;
        private String LastLoginIP;
        private String Created;
        private String Updated;
        private int RoleId;
        private int RankId;
        private int Status;
        private String StatusFriendName;
        private String LastLoginAtFormated;
        private String CreatedFromated;
        private String UpdatedFormated;

        public UserInfoBean getUserInfo() {
            return UserInfo;
        }

        public void setUserInfo(UserInfoBean UserInfo) {
            this.UserInfo = UserInfo;
        }

        public UserRankBean getUserRank() {
            return UserRank;
        }

        public void setUserRank(UserRankBean UserRank) {
            this.UserRank = UserRank;
        }

        public UserRoleBean getUserRole() {
            return UserRole;
        }

        public void setUserRole(UserRoleBean UserRole) {
            this.UserRole = UserRole;
        }

        public UserWalletBean getUserWallet() {
            return UserWallet;
        }

        public void setUserWallet(UserWalletBean UserWallet) {
            this.UserWallet = UserWallet;
        }

        public int getUserId() {
            return UserId;
        }

        public void setUserId(int UserId) {
            this.UserId = UserId;
        }

        public String getUsername() {
            return Username;
        }

        public void setUsername(String Username) {
            this.Username = Username;
        }

        public String getMobile() {
            return Mobile;
        }

        public void setMobile(String Mobile) {
            this.Mobile = Mobile;
        }

        public String getEmail() {
            return Email;
        }

        public void setEmail(String Email) {
            this.Email = Email;
        }

        public String getPassword() {
            return Password;
        }

        public void setPassword(String Password) {
            this.Password = Password;
        }

        public String getSalt() {
            return Salt;
        }

        public void setSalt(String Salt) {
            this.Salt = Salt;
        }

        public int getStar() {
            return Star;
        }

        public void setStar(int Star) {
            this.Star = Star;
        }

        public String getLastLoginAt() {
            return LastLoginAt;
        }

        public void setLastLoginAt(String LastLoginAt) {
            this.LastLoginAt = LastLoginAt;
        }

        public String getLastLoginIP() {
            return LastLoginIP;
        }

        public void setLastLoginIP(String LastLoginIP) {
            this.LastLoginIP = LastLoginIP;
        }

        public String getCreated() {
            return Created;
        }

        public void setCreated(String Created) {
            this.Created = Created;
        }

        public String getUpdated() {
            return Updated;
        }

        public void setUpdated(String Updated) {
            this.Updated = Updated;
        }

        public int getRoleId() {
            return RoleId;
        }

        public void setRoleId(int RoleId) {
            this.RoleId = RoleId;
        }

        public int getRankId() {
            return RankId;
        }

        public void setRankId(int RankId) {
            this.RankId = RankId;
        }

        public int getStatus() {
            return Status;
        }

        public void setStatus(int Status) {
            this.Status = Status;
        }

        public String getStatusFriendName() {
            return StatusFriendName;
        }

        public void setStatusFriendName(String StatusFriendName) {
            this.StatusFriendName = StatusFriendName;
        }

        public String getLastLoginAtFormated() {
            return LastLoginAtFormated;
        }

        public void setLastLoginAtFormated(String LastLoginAtFormated) {
            this.LastLoginAtFormated = LastLoginAtFormated;
        }

        public String getCreatedFromated() {
            return CreatedFromated;
        }

        public void setCreatedFromated(String CreatedFromated) {
            this.CreatedFromated = CreatedFromated;
        }

        public String getUpdatedFormated() {
            return UpdatedFormated;
        }

        public void setUpdatedFormated(String UpdatedFormated) {
            this.UpdatedFormated = UpdatedFormated;
        }

        public static class UserInfoBean {
            /**
             * UserId : 7
             * Wechat : null
             * Nickname : 加盟拓展部
             * Avatar : /Upload/All/20170830/1708301954355554884.jpg
             * Age : 0
             * AddressId : 0
             * Sex : 3
             * SexFriendName : 未知
             */

            private int UserId;
            private Object Wechat;
            private String Nickname;
            private String Avatar;
            private int Age;
            private int AddressId;
            private int Sex;
            private String SexFriendName;

            public int getUserId() {
                return UserId;
            }

            public void setUserId(int UserId) {
                this.UserId = UserId;
            }

            public Object getWechat() {
                return Wechat;
            }

            public void setWechat(Object Wechat) {
                this.Wechat = Wechat;
            }

            public String getNickname() {
                return Nickname;
            }

            public void setNickname(String Nickname) {
                this.Nickname = Nickname;
            }

            public String getAvatar() {
                return Avatar;
            }

            public void setAvatar(String Avatar) {
                this.Avatar = Avatar;
            }

            public int getAge() {
                return Age;
            }

            public void setAge(int Age) {
                this.Age = Age;
            }

            public int getAddressId() {
                return AddressId;
            }

            public void setAddressId(int AddressId) {
                this.AddressId = AddressId;
            }

            public int getSex() {
                return Sex;
            }

            public void setSex(int Sex) {
                this.Sex = Sex;
            }

            public String getSexFriendName() {
                return SexFriendName;
            }

            public void setSexFriendName(String SexFriendName) {
                this.SexFriendName = SexFriendName;
            }
        }

        public static class UserRankBean {
            /**
             * Id : 1
             * RankName : 加盟-合作中
             * Sort : 0
             */

            private int Id;
            private String RankName;
            private int Sort;

            public int getId() {
                return Id;
            }

            public void setId(int Id) {
                this.Id = Id;
            }

            public String getRankName() {
                return RankName;
            }

            public void setRankName(String RankName) {
                this.RankName = RankName;
            }

            public int getSort() {
                return Sort;
            }

            public void setSort(int Sort) {
                this.Sort = Sort;
            }
        }

        public static class UserRoleBean {
            /**
             * Id : 7
             * Title : 公司—超级管理员
             * IsSystem : false
             * Permissions : {"Name":"公司—超级管理员","Modules":[{"Id":"1","Name":"商品模块","Items":[{"Name":"商品管理","ControllerName":"Product","ActionName":"Index,GetPage"},{"Name":"添加商品","ControllerName":"Product","ActionName":"Create"},{"Name":"更新商品","ControllerName":"Product","ActionName":"Update"},{"Name":"删除商品","ControllerName":"Product","ActionName":"Remove"},{"Name":"订单管理","ControllerName":"Order","ActionName":"Index,GetPage"}]},{"Id":"2","Name":"用户模块","Items":[{"Name":"用户管理","ControllerName":"User","ActionName":"Index,GetPage"},{"Name":"添加用户","ControllerName":"User","ActionName":"Create"},{"Name":"更新用户","ControllerName":"User","ActionName":"Update"},{"Name":"删除用户","ControllerName":"User","ActionName":"Remove"},{"Name":"类型管理","ControllerName":"UserRank","ActionName":"Index,GetPage"},{"Name":"添加类型","ControllerName":"UserRank","ActionName":"Create"},{"Name":"更新类型","ControllerName":"UserRank","ActionName":"Update"},{"Name":"删除类型","ControllerName":"UserRank","ActionName":"Remove"}]},{"Id":"3","Name":"广告模块","Items":[{"Name":"商城首页","ControllerName":"Adv","ActionName":"ShopHome,Create,Update,Edit,Remove"},{"Name":"热门精选","ControllerName":"Adv","ActionName":"Hot,Create,Update,Edit,Remove"}]},{"Id":"4","Name":"资讯模块","Items":[{"Name":"资讯管理","ControllerName":"Info","ActionName":"Index,GetPage"},{"Name":"添加资讯","ControllerName":"Info","ActionName":"Create"},{"Name":"更新资讯","ControllerName":"Info","ActionName":"Update"},{"Name":"删除资讯","ControllerName":"Info","ActionName":"Remove"}]},{"Id":"5","Name":"分类模块","Items":[{"Name":"分类管理","ControllerName":"Category","ActionName":"Index,Shop,Info,GetTreeView"},{"Name":"添加分类","ControllerName":"Category","ActionName":"Create"},{"Name":"更新分类","ControllerName":"Category","ActionName":"Update"},{"Name":"删除分类","ControllerName":"Category","ActionName":"Remove"}]},{"Id":"6","Name":"财务模块","Items":[{"Name":"钱包历史记录","ControllerName":"UserWallet","ActionName":"Histories"},{"Name":"充值/还款记录","ControllerName":"UserWallet","ActionName":"Orders"}]},{"Id":"7","Name":"系统设置","Items":[{"Name":"应用设置","ControllerName":"Config","ActionName":"Application"},{"Name":"个推设置","ControllerName":"Config","ActionName":"GeTui"},{"Name":"支付宝设置","ControllerName":"Config","ActionName":"Alipay"},{"Name":"微信设置","ControllerName":"Config","ActionName":"WechatPay"},{"Name":"管理员管理","ControllerName":"Administrator","ActionName":"*"},{"Name":"权限管理","ControllerName":"UserRole","ActionName":"*"}]}]}
             */

            private int Id;
            private String Title;
            private boolean IsSystem;
            private String Permissions;

            public int getId() {
                return Id;
            }

            public void setId(int Id) {
                this.Id = Id;
            }

            public String getTitle() {
                return Title;
            }

            public void setTitle(String Title) {
                this.Title = Title;
            }

            public boolean isIsSystem() {
                return IsSystem;
            }

            public void setIsSystem(boolean IsSystem) {
                this.IsSystem = IsSystem;
            }

            public String getPermissions() {
                return Permissions;
            }

            public void setPermissions(String Permissions) {
                this.Permissions = Permissions;
            }
        }

        public static class UserWalletBean {
            /**
             * UserId : 7
             * UserBalance : 0.1
             * Credits : 0
             * BaseCredits : 0
             * Bounds : 0
             * UserLockBalance : 0
             */

            private int UserId;
            private double UserBalance;
            private int Credits;
            private int BaseCredits;
            private int Bounds;
            private int UserLockBalance;

            public int getUserId() {
                return UserId;
            }

            public void setUserId(int UserId) {
                this.UserId = UserId;
            }

            public double getUserBalance() {
                return UserBalance;
            }

            public void setUserBalance(double UserBalance) {
                this.UserBalance = UserBalance;
            }

            public int getCredits() {
                return Credits;
            }

            public void setCredits(int Credits) {
                this.Credits = Credits;
            }

            public int getBaseCredits() {
                return BaseCredits;
            }

            public void setBaseCredits(int BaseCredits) {
                this.BaseCredits = BaseCredits;
            }

            public int getBounds() {
                return Bounds;
            }

            public void setBounds(int Bounds) {
                this.Bounds = Bounds;
            }

            public int getUserLockBalance() {
                return UserLockBalance;
            }

            public void setUserLockBalance(int UserLockBalance) {
                this.UserLockBalance = UserLockBalance;
            }
        }
    }

    public static class UserInfoBeanX {
        /**
         * UserId : 7
         * Wechat : null
         * Nickname : 加盟拓展部
         * Avatar : /Upload/All/20170830/1708301954355554884.jpg
         * Age : 0
         * AddressId : 0
         * Sex : 3
         * SexFriendName : 未知
         */

        private String UserId;
        private Object Wechat;
        private String Nickname;
        private String Avatar;
        private int Age;
        private int AddressId;
        private int Sex;
        private String SexFriendName;

        public String getUserId() {
            return UserId;
        }

        public void setUserId(String UserId) {
            this.UserId = UserId;
        }

        public Object getWechat() {
            return Wechat;
        }

        public void setWechat(Object Wechat) {
            this.Wechat = Wechat;
        }

        public String getNickname() {
            return Nickname;
        }

        public void setNickname(String Nickname) {
            this.Nickname = Nickname;
        }

        public String getAvatar() {
            return Avatar;
        }

        public void setAvatar(String Avatar) {
            this.Avatar = Avatar;
        }

        public int getAge() {
            return Age;
        }

        public void setAge(int Age) {
            this.Age = Age;
        }

        public int getAddressId() {
            return AddressId;
        }

        public void setAddressId(int AddressId) {
            this.AddressId = AddressId;
        }

        public int getSex() {
            return Sex;
        }

        public void setSex(int Sex) {
            this.Sex = Sex;
        }

        public String getSexFriendName() {
            return SexFriendName;
        }

        public void setSexFriendName(String SexFriendName) {
            this.SexFriendName = SexFriendName;
        }
    }

    public static class UserWalletBeanX {
        /**
         * UserId : 7
         * UserBalance : 0.1
         * Credits : 0
         * BaseCredits : 0
         * Bounds : 0
         * UserLockBalance : 0
         */

        private int UserId;
        private double UserBalance;
        private int Credits;
        private int BaseCredits;
        private int Bounds;
        private int UserLockBalance;

        public int getUserId() {
            return UserId;
        }

        public void setUserId(int UserId) {
            this.UserId = UserId;
        }

        public double getUserBalance() {
            return UserBalance;
        }

        public void setUserBalance(double UserBalance) {
            this.UserBalance = UserBalance;
        }

        public int getCredits() {
            return Credits;
        }

        public void setCredits(int Credits) {
            this.Credits = Credits;
        }

        public int getBaseCredits() {
            return BaseCredits;
        }

        public void setBaseCredits(int BaseCredits) {
            this.BaseCredits = BaseCredits;
        }

        public int getBounds() {
            return Bounds;
        }

        public void setBounds(int Bounds) {
            this.Bounds = Bounds;
        }

        public int getUserLockBalance() {
            return UserLockBalance;
        }

        public void setUserLockBalance(int UserLockBalance) {
            this.UserLockBalance = UserLockBalance;
        }
    }

    public static class UserRoleBeanX {
        /**
         * Id : 7
         * Title : 公司—超级管理员
         * IsSystem : false
         * Permissions : {"Name":"公司—超级管理员","Modules":[{"Id":"1","Name":"商品模块","Items":[{"Name":"商品管理","ControllerName":"Product","ActionName":"Index,GetPage"},{"Name":"添加商品","ControllerName":"Product","ActionName":"Create"},{"Name":"更新商品","ControllerName":"Product","ActionName":"Update"},{"Name":"删除商品","ControllerName":"Product","ActionName":"Remove"},{"Name":"订单管理","ControllerName":"Order","ActionName":"Index,GetPage"}]},{"Id":"2","Name":"用户模块","Items":[{"Name":"用户管理","ControllerName":"User","ActionName":"Index,GetPage"},{"Name":"添加用户","ControllerName":"User","ActionName":"Create"},{"Name":"更新用户","ControllerName":"User","ActionName":"Update"},{"Name":"删除用户","ControllerName":"User","ActionName":"Remove"},{"Name":"类型管理","ControllerName":"UserRank","ActionName":"Index,GetPage"},{"Name":"添加类型","ControllerName":"UserRank","ActionName":"Create"},{"Name":"更新类型","ControllerName":"UserRank","ActionName":"Update"},{"Name":"删除类型","ControllerName":"UserRank","ActionName":"Remove"}]},{"Id":"3","Name":"广告模块","Items":[{"Name":"商城首页","ControllerName":"Adv","ActionName":"ShopHome,Create,Update,Edit,Remove"},{"Name":"热门精选","ControllerName":"Adv","ActionName":"Hot,Create,Update,Edit,Remove"}]},{"Id":"4","Name":"资讯模块","Items":[{"Name":"资讯管理","ControllerName":"Info","ActionName":"Index,GetPage"},{"Name":"添加资讯","ControllerName":"Info","ActionName":"Create"},{"Name":"更新资讯","ControllerName":"Info","ActionName":"Update"},{"Name":"删除资讯","ControllerName":"Info","ActionName":"Remove"}]},{"Id":"5","Name":"分类模块","Items":[{"Name":"分类管理","ControllerName":"Category","ActionName":"Index,Shop,Info,GetTreeView"},{"Name":"添加分类","ControllerName":"Category","ActionName":"Create"},{"Name":"更新分类","ControllerName":"Category","ActionName":"Update"},{"Name":"删除分类","ControllerName":"Category","ActionName":"Remove"}]},{"Id":"6","Name":"财务模块","Items":[{"Name":"钱包历史记录","ControllerName":"UserWallet","ActionName":"Histories"},{"Name":"充值/还款记录","ControllerName":"UserWallet","ActionName":"Orders"}]},{"Id":"7","Name":"系统设置","Items":[{"Name":"应用设置","ControllerName":"Config","ActionName":"Application"},{"Name":"个推设置","ControllerName":"Config","ActionName":"GeTui"},{"Name":"支付宝设置","ControllerName":"Config","ActionName":"Alipay"},{"Name":"微信设置","ControllerName":"Config","ActionName":"WechatPay"},{"Name":"管理员管理","ControllerName":"Administrator","ActionName":"*"},{"Name":"权限管理","ControllerName":"UserRole","ActionName":"*"}]}]}
         */

        private int Id;
        private String Title;
        private boolean IsSystem;
        private String Permissions;

        public int getId() {
            return Id;
        }

        public void setId(int Id) {
            this.Id = Id;
        }

        public String getTitle() {
            return Title;
        }

        public void setTitle(String Title) {
            this.Title = Title;
        }

        public boolean isIsSystem() {
            return IsSystem;
        }

        public void setIsSystem(boolean IsSystem) {
            this.IsSystem = IsSystem;
        }

        public String getPermissions() {
            return Permissions;
        }

        public void setPermissions(String Permissions) {
            this.Permissions = Permissions;
        }
    }
}
