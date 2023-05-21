--create database ThanSoHoc2
--use ThanSoHoc2

CREATE TABLE TaiKhoan(
	TK NVARCHAR(50) PRIMARY KEY NOT NULL,
	MK NVARCHAR(50) ,
	ChucVu NVARCHAR(50),
)

CREATE TABLE Users(
	ID INT  IDENTITY(1,1) PRIMARY KEY NOT NULL,
	MaUser NVARCHAR(50) NOT NULL,
	Name NVARCHAR(50),
	Ngay INT,
	Thang INT,
	Nam INT,
	Sex NVARCHAR(50),
	FTK NVARCHAR(50),
	FOREIGN KEY(FTK) REFERENCES TaiKhoan(TK),
)


CREATE TABLE QuanLy (
	ID INT  IDENTITY(1,1) PRIMARY KEY NOT NULL,
	MaQL NVARCHAR(50) NOT NULL,
	TenQL NVARCHAR(50),
	Ngay INT,
	Thang INT,
	Nam INT,
	FTK NVARCHAR(50),
	FOREIGN KEY(FTK) REFERENCES TaiKhoan(TK), 
)

CREATE TABLE soChuDao (
	ID INT  IDENTITY(1,1) PRIMARY KEY NOT NULL,
	SoCD NVARCHAR(500) UNIQUE,
	NDCD NVARCHAR(500),
	DiemManh NVARCHAR(500),
	DiemYeu NVARCHAR(500),
	TinhCach NVARCHAR(500),
)

create table CK(
	ID INT  IDENTITY(1,1) PRIMARY KEY NOT NULL,
	SoCK NVARCHAR(50) NOT NULL,
	ND NVARCHAR(500),
	BienPhap NVARCHAR(500),
	TinhYeu NVARCHAR(500),
)

CREATE TABLE ThongTinHienThi(
	ID INT  IDENTITY(1,1) PRIMARY KEY NOT NULL,
	IDSCD INT,
	IDCK INT,
	IDUsers INT,

	FOREIGN KEY(IDSCD) REFERENCES soChuDao(ID),
	FOREIGN KEY(IDCK) REFERENCES CK(ID),
	FOREIGN KEY(IDUsers) REFERENCES Users(ID),
)
INSERT INTO TaiKhoan(TK,MK,ChucVu)
VALUES 
('cun123', '123', 'admin'),
('sieucute', '123', 'user');


INSERT INTO CK( SoCK, ND, BienPhap, TinhYeu)
VALUES 
('1','Có khả năng tự lập và độc lập cao, điềm tĩnh trong tình huống áp lực, và thường được người khác tôn trọng vì tinh thần lãnh đạo của mình. Họ cũng thường có tài năng sáng tạo và sự quyết tâm để đạt được mục tiêu trong cuộc sống.'
,'Tránh stress và lo lắng quá mức: Stress và lo lắng có thể ảnh hưởng đến sức khỏe tâm lý và thể chất của bạn. Hãy tìm cách giảm stress bằng cách tập thể dục, thực hành yoga, meditate, hoặc tham gia các hoạt động thư giãn khác.',
'Những người có số chu kỳ vận số 1 thường rất quyết đoán và độc lập. Bạn có thể có xu hướng tự tin và thích gây ấn tượng, và thường tìm kiếm mối quan hệ tình cảm đầy thử thách và sự cạnh tranh. Bạn cũng có thể cảm thấy khó khăn khi phải chia sẻ quyền lực trong mối quan hệ.'),

('2','có khả năng tương tác xã hội tốt, có khả năng tạo ra mối quan hệ tốt với mọi người xung quanh, và thường được đánh giá cao vì tính cách thân thiện và hòa nhã của mình. Họ cũng thường có khả năng giải quyết mâu thuẫn và tìm ra giải pháp tốt nhất cho các tình huống khó khăn.'
,'Tránh những quyết định lớn trong thời gian này: Tránh đưa ra những quyết định lớn như kết hôn, chuyển việc, hoặc mua nhà trong thời gian này nếu không cần thiết. Hãy đợi đến khi bạn có tâm trí và tinh thần ổn định hơn.',
'Những người có số chu kỳ vận số 2 thường rất nhân từ và tình cảm. Bạn cảm thấy thoải mái khi được bao quanh bởi tình yêu và sự quan tâm của người khác, và thường tìm kiếm mối quan hệ lâu dài và ổn định. Tuy nhiên, Bạn cũng có thể cảm thấy khó khăn khi phải đối mặt với sự phản đối hoặc xung đột trong mối quan hệ.'),

('3',
'Người có số vận hạn là 3 có thể gặp khó khăn trong việc tập trung và hoàn thành một công việc. Họ có thể dễ bị xao nhãng bởi những ý tưởng mới mẻ và có thể thiếu kiên nhẫn khi đối mặt với những trở ngại và khó khăn trong cuộc đời.',
'Tránh sự xung đột và tranh cãi: Cố gắng giữ mối quan hệ với những người xung quanh bằng cách tránh xung đột và tranh cãi. Hãy giữ tinh thần bình tĩnh và thấu hiểu lập trường của người khác.',
'Những người có số chu kỳ vận số 3 thường rất quan tâm đến việc kết nối với người khác thông qua tình yêu, lãng mạn và sáng tạo. Bạn có thể cảm thấy thoải mái khi được truyền cảm hứng và khám phá cùng người bạn đời, và thường tìm kiếm mối quan hệ tình cảm đầy màu sắc và đa dạng. Tuy nhiên, Bạn cũng có thể cảm thấy khó khăn khi phải đối mặt với sự thiếu nhất quán và thất vọng trong mối quan hệ.'),

('4',
'Người có số vận hạn là 4 có thể gặp khó khăn trong việc thích nghi với những thay đổi và thử thách trong cuộc đời. Họ có thể cảm thấy bị hạn chế bởi sự cứng nhắc và có thể khó khăn trong việc thay đổi hành động và suy nghĩ.',
'Tránh mạo hiểm và đầu tư quá nhiều: Tránh mạo hiểm và đầu tư quá nhiều trong thời gian này, đặc biệt là trong các loại đầu tư rủi ro cao. Hãy đầu tư thông minh và cân nhắc kỹ trước khi quyết định đầu tư vào bất kỳ thứ gì.',
'Những người có số chu kỳ vận số 4 thường rất cần sự ổn định và an toàn trong mối quan hệ. Bạn có thể có xu hướng khá bảo thủ và kiểm soát, và thường tìm kiếm mối quan hệ tình cảm đầy trách nhiệm và tôn trọng. Tuy nhiên, Bạn cũng có thể cảm thấy khó khăn khi phải đối mặt với sự thay đổi và sự không ổn định trong mối quan hệ.'),

('5',
'Người có số vận hạn là 5 có thể gặp khó khăn trong việc kiểm soát bản thân và tránh những thói quen xấu. Họ có thể dễ bị phân tâm và có thể cảm thấy khó khăn trong việc giữ được sự ổn định trong cuộc sống.',
'Tránh lãng phí và chi tiêu quá mức: Hãy cẩn thận trong việc chi tiêu và tránh lãng phí tiền bạc trong thời gian này. Hãy lập kế hoạch chi tiêu hợp lý và cân nhắc kỹ trước khi mua bất kỳ sản phẩm hoặc dịch vụ nào.',
'Những người có số chu kỳ vận số 5 thường rất tò mò và thích khám phá. Bạn có thể có xu hướng không ổn định và khó kiểm soát, và thường tìm kiếm mối quan hệ tình cảm đầy phiêu lưu và thử thách. Tuy nhiên, Bạn cũng có thể cảm thấy khó khăn khi phải đối mặt với sự cam kết và sự ổn định trong mối quan hệ.'),

('6',
'có tình cảm gia đình rất sâu sắc, có khả năng gìn giữ và bảo vệ mối quan hệ tình cảm, và có tâm hồn nhân đạo, giúp đỡ người khác trong những tình huống khó khăn. Họ cũng thường có tài năng sáng tạo và khả năng đưa ra quyết định tốt trong cuộc sống.',
'Tránh quá tự tin và kiêu ngạo: Hãy cẩn thận với tư duy quá tự tin và kiêu ngạo. Hãy luôn cởi mở và học hỏi từ người khá',
'Những người có số chu kỳ vận số 6 thường rất đam mê và quan tâm đến việc xây dựng mối quan hệ tình cảm vững chắc và lâu dài. Bạn có thể có xu hướng nhạy cảm và chăm sóc người khác hơn là chăm sóc bản thân, và thường tìm kiếm mối quan hệ tình cảm đầy yêu thương và chân thành. Tuy nhiên, Bạn cũng có thể cảm thấy khó khăn khi phải đối mặt với sự không công bằng và sự kiểm soát trong mối quan hệ.'),

('7',
'Người có số vận hạn là 7 có thể cảm thấy cô đơn hoặc bị bỏ rơi trong việc tìm kiếm ý nghĩa cuộc sống. Họ có thể bị đánh lừa bởi sự hoang đường và có thể gặp khó khăn trong việc kết nối với người khác và giao tiếp một cách hiệu quả.',
'Tránh trì hoãn và lười biếng: Hãy cố gắng hoàn thành các nhiệm vụ trong thời gian đã định và tránh trì hoãn hay lười biếng. Hãy lập kế hoạch và tổ chức thời gian hợp lý.',
'Những người có số chu kỳ vận số 7 thường rất tập trung vào việc khám phá thế giới tâm linh và tìm kiếm sự hiểu biết sâu sắc về bản thân. Bạn có thể có xu hướng cô độc và khó gần, và thường tìm kiếm mối quan hệ tình cảm đầy định hướng và chân thành. Tuy nhiên, Bạn cũng có thể cảm thấy khó khăn khi phải đối mặt với sự thiếu kiên nhẫn và sự khó hiểu trong mối quan hệ.'),

('8',
'Số này được coi là một trong những số may mắn nhất, vì nó mang lại sự giàu có và thịnh vượng. Số 8 thường được sử dụng trong kinh doanh và tài chính vì nó được liên kết với tiền tài và sự thịnh vượng.',
'Người có số vận hạn là 8 có thể gặp khó khăn trong việc giữ vững sự cân bằng giữa công việc và cuộc sống cá nhân. Họ có thể trở nên quá tập trung vào tiền bạc và đưa ra những quyết định thiếu suy nghĩ.',
'Những người có số chu kỳ vận số 8 thường rất tập trung vào việc thành công và tiền bạc. Bạn có thể có xu hướng quá tập trung vào công việc và thiếu thời gian cho mối quan hệ tình cảm. Tuy nhiên, nếu Bạn quyết tâm xây dựng mối quan hệ, Bạn sẽ đưa ra một nỗ lực rất lớn để đảm bảo rằng mối quan hệ đó đầy đủ tình cảm và ổn định. Bạn tìm kiếm mối quan hệ tình cảm đầy định hướng và đồng thuận, nhưng đôi khi có thể trở nên quá khắt khe và kiểm soát trong mối quan hệ'),

('9',
'Số này được liên kết với sự hoàn thiện và sự thành công. Nó cũng được coi là một con số may mắn trong tình yêu và hôn nhân, vì nó đại diện cho tình yêu và sự chung thủy.',
'Người có số vận hạn là 9 có thể có khuynh hướng tự ái và cảm thấy mình là người độc đoán. Họ có thể gặp khó khăn trong việc chấp nhận sự thay đổi và phải đối mặt với những điều không như mong đợi.',
'Những người có số chu kỳ vận số 9 thường rất đam mê và có tình cảm sâu sắc. Bạn có thể có xu hướng lãng mạn và tìm kiếm mối quan hệ tình cảm đầy yêu thương và cảm thông. Tuy nhiên, Bạn cũng có thể cảm thấy khó khăn khi phải đối mặt với sự không công bằng và thiếu hiểu biết trong mối quan hệ. Bạn cần tìm một người đối tác đủ thông minh và đáng tin cậy để chia sẻ mối quan tâm của mình và đồng cảm với Bạn.');

INSERT INTO QuanLy(EmailQL, TenQL, Ngay, Thang, Nam, FTK)
VALUES
('QL001','Nguyen Van A','1','12','2003','cun123'),
('QL002','Nguyen Van b','1','11','2003','cun123');

INSERT INTO soChuDao(SoCD, NDCD, DiemManh, DiemYeu, TinhCach)
VALUES
('1', 'Đại diện cho sự độc lập, quyết đoán, sáng tạo và lãnh đạo. Những người có số 1 trong thần số học thường có tính cách quyết đoán, quyền lực và khả năng lãnh đạo tốt. Họ có thể có xu hướng thiếu linh hoạt và cứng nhắc, nhưng cũng có thể trở nên rất độc lập và tự tin trong việc đưa ra quyết định.',
'Sự độc lập, quyết đoán và tập trung. Họ có tinh thần lý trí, sáng tạo và giỏi lãnh đạo. Sự độc lập giúp họ đạt được thành công trong cuộc sống.', 
'Tính cô đơn, cứng đầu và khó thích nghi. Bạn có thể không thích làm việc theo nhóm và khó thích nghi với môi trường mới.', 
'Mạnh mẽ - Độc lập - Tự Tin'),

('2', 
'Biểu thị sự hợp tác, nhân từ, cảm thông và sự cân bằng. Những người có số 2 trong thần số học thường có tính cách hòa đồng, nhân từ và có khả năng tương tác xã hội tốt. Họ có thể dễ bị ảnh hưởng bởi những ý kiến của người khác và có thể cảm thấy bất an khi phải đối mặt với sự mâu thuẫn.', 
'Sự hợp tác, nhạy cảm và thấu hiểu. Bạn có tinh thần lãnh đạo, chăm sóc và giúp đỡ người khác. Bạn tạo ra mối quan hệ tốt và thường được yêu mến.', 
'Tính phụ thuộc, nhút nhát và quá nhạy cảm. Bạn có thể quá phụ thuộc vào người khác, dễ cảm thấy bị tổn thương và thiếu sự tự tin.', 
'Lắng nghe - Khéo léo - Nhạy cảm' ),

('3', 
'Biểu thị sự sáng tạo, trí tuệ, khả năng giao tiếp và sự cởi mở. Những người có số 3 trong thần số học thường có tính cách sáng tạo, hài hước và có khả năng giao tiếp tốt. Họ có thể có xu hướng nói quá và thiếu kiên nhẫn, nhưng cũng có thể trở nên rất tinh tế và năng động trong công việc.', 
'Sự sáng tạo, truyền cảm hứng và giao tiếp tốt. Bạn có tinh thần lạc quan, thông minh và có khả năng truyền cảm hứng cho người khác. Bạn tạo ra những ý tưởng mới và động lực cho người khác.', 
'Tính bất ổn, khó tập trung và thiếu kiên nhẫn. Bạn có thể khó kiểm soát được cảm xúc và tâm trạng, dễ bị phân tâm và thiếu kiên nhẫn để đạt được mục tiêu.', 
'Sáng tạo - Hoạt bát  - Lạc Quan' ),

('4', 
'Biểu thị sự ổn định, kiên nhẫn, sự kiểm soát và sự chăm chỉ. Những người có số 4 trong thần số học thường có tính cách chăm chỉ, có khả năng kiểm soát tốt và có trách nhiệm cao. Họ có thể có xu hướng quá nghiêm túc và khó thích nghi, nhưng cũng có thể trở nên rất đáng tin cậy và kiên trì trong công việc.', 
'Sự ổn định, kiên trì và đáng tin cậy. Bạn có tinh thần thực tế và làm việc chăm chỉ để đạt được mục tiêu. Sự đáng tin cậy giúp Bạn được tôn trọng và được người khác tin tưởng.', 
'Tính cứng đầu, bảo thủ và ích kỷ. Bạn có thể không chấp nhận được thay đổi và khó chấp nhận những ý kiến khác, làm cho bạn trở nên bảo thủ và ích kỷ.', 
'Cẩn thận - Cầu toàn - Thực tế' ),

('5', 
'Biểu thị sự phiêu lưu, sự thích thú và sự tự do. Những người có số 5 trong thần số học thường có tính cách năng động, thích phiêu lưu và có khả năng thích nghi tốt. Họ có thể có xu hướng thiếu kiên nhẫn và không ổn định, nhưng cũng cóthể trở nên rất sáng tạo và có tầm nhìn rộng lớn trong cuộc sống.', 
'Sự thay đổi và tự do. Bạn có tinh thần phiêu lưu, tò mò và muốn khám phá những điều mới mẻ. Sự tự do giúp bạn đạt được độc lập và thành công.', 
'Tính bất ổn và thiếu trách nhiệm. Bạn có thể thiếu trách nhiệm và dễ bị phân tâm vì muốn khám phá những điều mới. Tính bất ổn làm cho bạn khó kiểm soát được cảm xúc và tâm trạng.', 
'Năng động - Linh Hoạt - Tò mò' ),

('6', 
'Biểu thị sự tình cảm, sự quan tâm và sự hướng nội. Những người có số 6 trong thần số học thường có tính cách tình cảm, quan tâm và sáng suốt. Họ có thể có xu hướng quá nhạy cảm và thiếu tự tin, nhưng cũng có thể trở nên rất đáng tin cậy và chăm sóc người khác.', 
'Sự yêu thương, quan tâm và tình cảm. Bạn có tinh thần hướng nội, chăm sóc và quan tâm đến người khác. Bạn là người thấu hiểu và thường được yêu mến', 
'Tính cảm động và ghen tuông. Bạn có thể dễ cảm động và khó kiểm soát được cảm xúc. Tính ghen tuông có thể khiến bạn khó chấp nhận được sự thay đổi và cảm thấy bị mất kiểm soát.', 
'Quan tâm - Yêu thương - Kiểm soát' ),

('7', 
'Biểu thị sự tập trung, sự khám phá và sự sâu sắc. Những người có số 7 trong thần số học thường có tính cách tập trung, sâu sắc và có khả năng khám phá tốt. Họ có thể có xu hướng cô đơn và cảm thấy bất an, nhưng cũng có thể trở nên rất thông minh và suy nghĩ sâu sắc.', 
'Sự tập trung, sâu sắc và tò mò. Bạn có tinh thần lý trí, sáng tạo và khả năng tập trung vào mục tiêu. Bạn là người sâu sắc và muốn tìm hiểu những điều mới mẻ.', 
'Tính cô đơn và khó gần gũi. Bạn có thể khó giao tiếp và khó thích nghi với môi trường mới. Tính cô đơn có thể khiến bạn cảm thấy bị cách biệt và cảm thấy buồn chán.', 
'Thông thái - Khám phá - Truyền đạt' ),

('8', 
'Biểu thị sự quyền lực, sự thịnh vượng và sự thành công. Những người có số 8 trong thần số học thường có tính cách quyền lực, thịnh vượng và đầy năng lượng. Họ có thể có xu hướng quá tự tin và khó thấu hiểu, nhưng cũng có thể trở nên rất giàu có và thành công trong cuộc sống.', 
'Sự quyền lực, thực tế và thành công. Bạn có tinh thần lãnh đạo và đam mê để đạt được thành công. Sự thực tế giúp bạn đưa ra những quyết định đúng đắn và đạt được kết quả tốt.', 
' Tính kiêu ngạo và tham lam. Bạn có thể cảm thấy kiêu ngạo với quyền lực và thành công của mình. Tính tham lam có thể khiến bạn bị mất kiểm soát và không có giới hạn.', 
'Công bằng - Tập trung - Lý tưởng' ),

('9', 
'Biểu thị sự cao thượng, sự tử tế và sự phục vụ. Những người có số 9 trong thần số học thường có tính cách cao thượng, tử tế và sẵn sàng phục vụ người khác. Họ có thể có xu hướng quá hoàn mỹ và thiếu linh hoạt, nhưng cũng có thể trở nên rất nhân đức và có khả năng giúp đỡ người khác.', 
' Sự hoàn thiện, hướng ngoại và nhân ái. Bạn có tinh thần hướng ngoại và muốn giúp đỡ những người khác. Bạn là người có tình yêu thương và sự nhân ái, và muốn giúp đỡ những người gặp khó khăn.', 
'Tính cảm xúc và thiếu kiên nhẫn. Bạn có thể dễ bị ảnh hưởng bởi cảm xúc và khó kiểm soát được tâm trạng. Tính thiếu kiên nhẫn có thể khiến bạn dễ nản lòng và không kiên trì đến cùng.', 
'Trách nghiệm - Rộng lượng - Hào phóng' ),

('11', 
'sự đam mê và sự độc lập. Những người có con số chủ đạo là 11 thường có tầm nhìn rộng và muốn khám phá những điều mới mẻ. Họ thường tỏ ra mạnh mẽ, quyết đoán và độc lập trong suy nghĩ và hành động.', 
'Sự sáng tạo và trực giác. Bạn có tinh thần sáng tạo, trực giác và có khả năng nhìn thấy những điều bên trong đằng sau bề ngoài. Bạn là người có tầm nhìn rộng và đam mê khám phá những điều mới mẻ.', 
'Tính nhạy cảm và bất ổn. Bạn có thể dễ cảm động và khó kiểm soát được tâm trạng. Tính bất ổn có thể khiến bạn dễ bị phân tâm và khó tập trung vào mục tiêu của mình.', 
'Cẩn thận - Cầu toàn - Thực tế' );

INSERT INTO Users(MaUser, Name, Ngay, Thang, Nam, Sex, FTK)
VALUES 
('tranthib@gmail.com', 'Tran Thi B', '2', '3', '2003', 'Nu' ,'sieucute'),
('tranthia@gmail.com', 'Tran Thi A', '2', '4', '2003', 'Nu' ,'sieucute');