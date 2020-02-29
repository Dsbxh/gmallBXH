# gmallBXH 0001修改版本
gmall-User 用戶管理模块 8080

tkMapper :1.使用insert时，需要在实体类的主键上加上 @Id 表明其为主键
          2.需要在插入时返回新增主键，需要配置@GeneratedValue(strategy = GenerationType.IDENTITY) 
          3.在springboot启动文件上的mapperscan 需要改成tkmapper包中的包扫描
          
          Example example = new Example(T.class);
          example.createCriteria().andEqualTo("memberId"(实体类中需要作为查询条件的 属性 ),参数);