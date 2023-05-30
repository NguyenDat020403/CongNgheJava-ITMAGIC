CREATE DATABASE thanSoHoc;
USE thanSoHoc

CREATE TABLE ChiSoThang(
	ID INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
	ChiSoThang NVARCHAR(50),
	BieuHien NVARCHAR(200)
)

CREATE TABLE ChiSoNam(
	ID INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
	ChiSoNam NVARCHAR(50),
	SuKhoiDau NVARCHAR(4000),
	SuDocLap NVARCHAR(4000),
	NhanThuc NVARCHAR(4000)
)
CREATE TABLE soChuDao (
	SoCD NVARCHAR(50) PRIMARY KEY NOT NULL,
	NDCD NVARCHAR(500),
	DiemManh NVARCHAR(500),
	DiemYeu NVARCHAR(500),
	TinhCach NVARCHAR(500),
	
)
CREATE TABLE NguoiNoiTieng(
	MaSCD NVARCHAR(50) PRIMARY KEY NOT NULL,
	SuNghiep NVARCHAR(500),
	Ten NVARCHAR(500)
	FOREIGN KEY(MaSCD) REFERENCES soChuDao(SoCD)
)


create table CK(
	SoCK NVARCHAR(50) PRIMARY KEY NOT NULL,
	ND NVARCHAR(500),
	BienPhap NVARCHAR(500),
	TinhYeu NVARCHAR(500),
)

CREATE TABLE TaiKhoan(
	TK NVARCHAR(50) PRIMARY KEY NOT NULL,
	MK NVARCHAR(50) ,
	ChucVu NVARCHAR(50),
	Email NVARCHAR(50) UNIQUE,
	Ten NVARCHAR(50),
	Ngay INT,
	Thang INT,
	Nam INT,
	SLTraCuu INT,

)

CREATE TABLE ThongTinNhap(
	ID INT  IDENTITY(1,1) PRIMARY KEY NOT NULL,
	EmailUser NVARCHAR(50) UNIQUE NOT NULL,
	Name NVARCHAR(50),
	Ngay INT,
	Thang INT,	
	Nam INT,
	Sex NVARCHAR(50),
	SDT INT,
	FTK NVARCHAR(50),
	FOREIGN KEY(FTK) REFERENCES TaiKhoan(TK),
)


CREATE TABLE ThongTinHienThi(
	ID INT  IDENTITY(1,1) PRIMARY KEY NOT NULL,
	IDSCD NVARCHAR(50),
	IDCK NVARCHAR(50),
	IDThongTinNhap INT,
	NgayTraCuu DATE,
	IDCSN INT,
	IDCST INT,

	FOREIGN KEY(IDSCD) REFERENCES soChuDao(soCD),
	FOREIGN KEY(IDCK) REFERENCES CK(SoCK),
	FOREIGN KEY(IDThongTinNhap) REFERENCES ThongTinNhap(ID),
	FOREIGN KEY(IDCSN) REFERENCES ChiSoNam(ID),
	FOREIGN KEY(IDCST) REFERENCES ChiSoThang(ID),

)

CREATE TABLE ThongTinVIP(
	ID INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
	FTK NVARCHAR(50),
	SL INT,
	FOREIGN KEY(FTK) REFERENCES TaiKhoan(TK),
)

INSERT INTO ThongTinVIP( FTK, SL)
VALUES
('sieucute', '3'),
('cun123', '3');

INSERT INTO ChiSoNam( ChiSoNam, SuKhoiDau, SuDocLap, NhanThuc)
VALUES
('1', N'Người có NhanThuc là 1 thường có khả năng suy nghĩ sâu sắc và nhận thức tốt về môi trường xung quanh. Họ có thể là những người tư vấn, nghiên cứu hoặc có khả năng phân tích thông tin một cách sắc bén.'
, N'Sự khởi đầu của số 1 thường mang tính chất quyết đoán và độc lập. Người có SuKhoiDau là 1 thường có sự sáng tạo và tinh thần pionee (người tiên phong). Họ thích đơn độc và có thể tự mình tạo ra những ý tưởng và dự án mới.',
N'Người có SuKhoiDau là 1 thường có sự sáng tạo và tinh thần pionee (người tiên phong). Họ thích đơn độc và có thể tự mình tạo ra những ý tưởng và dự án mới.'),
('2', N'Người có SuKhoiDau là 2 thường là những người lắng nghe và tôn trọng ý kiến của người khác. Họ có khả năng làm việc nhóm và xây dựng mối quan hệ tốt với mọi người.',
N'Người có SuDocLap là 2 thường có sự nhạy cảm và tình cảm. Họ có nhu cầu được chăm sóc và đồng cảm với người khác. Họ thường tìm kiếm sự hòa hợp và sự ổn định trong mối quan hệ.', 
N'Người có NhanThuc là 2 thường có khả năng đọc hiểu người khác và cảm nhận không gian tình cảm. Họ có sự nhạy bén đặc biệt về sự thay đổi và có khả năng dự đoán một cách chính xác.'),
('3', N'Người có SuKhoiDau là 3 thường là những người nghệ sĩ, diễn viên hoặc người có khả năng giao tiếp xuất sắc. Họ có khả năng thúc đẩy người khác và tạo ra sự lạc quan và vui vẻ.', 
N'Người có SuDocLap là 3 thường là những người tự do tư duy và biểu đạt bản thân một cách sáng tạo. Họ thích tự do sáng tạo và không muốn bị hạn chế trong việc thể hiện bản thân.', 
N'Người có NhanThuc là 3 thường có khả năng quan sát tinh tế và phân tích chi tiết. Họ có sự nhạy bén về nghệ thuật và khả năng nhìn thấy những khía cạnh đặc biệt trong cuộc sống.'),
('4', N'Người có SuKhoiDau là 4 thường là những người có tính kỷ luật cao và khả năng làm việc chăm chỉ. Họ có sự kiên nhẫn trong việc đạt được mục tiêu và xây dựng cơ bản vững chắc.', 
N'gười có SuDocLap là 4 thường là những người đáng tin cậy và trung thành. Họ thích sự ổn định và cảm thấy an tâm khi có kế hoạch và sự tổ chức trong cuộc sống.', 
N' Người có NhanThuc là 4 thường có khả năng nhìn nhận vấn đề một cách thực tế và xác định cách tiếp cận cơ bản. Họ có kỹ năng quản lý và xử lý thông tin một cách cẩn thận.'),
('5', N'Sự khởi đầu của số 5 thường mang tính chất sự thay đổi và sự phiêu lưu', 
N'Số 5 biểu thị sự đa dạng và linh hoạt. Họ không thích sự hạn chế và muốn tự do hành động.', 
N'Người có NhanThuc là 5 thường có tư duy sáng tạo và khả năng nghĩ ra các ý tưởng mới.'),
('6', N'những người quan tâm và chu đáo với người khác. Họ có khả năng xây dựng mối quan hệ tốt và sẵn lòng giúp đỡ.', 
N'Họ có sự nhạy bén về tình cảm và tìm kiếm sự hòa hợp trong môi trường xung quanh.', 
N'Họ muốn đóng góp vào xã hội và làm điều tốt cho mọi người.'),
('7', N'Người có SuKhoiDau là 7 thường là những người ham muốn hiểu biết và có khả năng nghiên cứu sâu. Họ thích đặt câu hỏi và tìm kiếm sự thật.', 
N'Họ thích làm việc một mình và tìm hiểu sâu về một vấn đề.', 
N'Họ tin vào trực giác và có khả năng cảm nhận những điều vượt qua giới hạn thông thường.'),
('8', N'Người có SuKhoiDau là 8 thường là những người quyết đoán và có khả năng đạt được thành công vượt trội. Họ thích kiểm soát và có ý chí mạnh mẽ.', 
N'Họ tin tưởng vào khả năng của mình và sẵn lòng đảm nhận trách nhiệm lớn.', 
N'Họ có tầm nhìn rộng và muốn xây dựng định mệnh của mình.'),
('9', N'Họ có ý thức cao về trách nhiệm xã hội và muốn tạo sự thay đổi tích cực.', 
N'Họ muốn tạo sự đồng lòng và sự hiểu biết giữa mọi người.', 
N'Họ có ý thức về giá trị cuối cùng và muốn sống một cuộc sống có ý nghĩa.');


INSERT INTO NguoiNoiTieng(Ten, SuNghiep, MaSCD)
VALUES 
('Barack Obama ', N'Lãnh đạo, doanh nhân, người sáng tạo, nhà hoạt động xã hội.', '1'),
('Oprah Winfrey ', N'Lãnh đạo, nhà sản xuất phim, nghệ sĩ, nhà tâm lý học.', '11'),
('John Lennon ', N'Nghệ sĩ, nhà thiết kế, giáo viên, nhà từ thiện.', '2'),
('Walt Disney ', N'Nghệ sĩ, nhà sản xuất, nhà văn, diễn viên.', '3'),
(' Bill Gates ', N'Kỹ sư, nhà thiết kế, nhà kinh doanh, nhà khoa học.', '4'),
('Angelina Jolie', N'Nhà hoạt động xã hội, nhà sản xuất phim, nhà thiết kế, phi công.', '5'),
(' John F. Kennedy ', N'Y tá, chính trị gia, nghệ sĩ, nhà thiết kế thời trang.', '6'),
(' Albert Einstein ', N'Nhà khoa học, nhà tư tưởng, nhà văn, nhà nghiên cứu tâm lý.', '7'),
('Bill Clinton  ', N' Nhà kinh doanh, nhà đầu tư, nhà quản lý, vận động viên chuyên nghiệp', '8'),
('Bob Marley  ', N'Nhà hoạt động xã hội, nhạc sĩ, nhà thiết kế, nhà từ thiện.', '9');

INSERT INTO ChiSoThang(ChiSoThang, BieuHien)
VALUES 
('1',N'Biểu thị tính cách lãnh đạo, quyết đoán và sự độc lập.'),
('2',N'Đại diện cho tính nhạy cảm, hợp tác và khả năng thích ứng..'),
('3',N'Biểu thị sự sáng tạo, niềm vui và khả năng giao tiếp.'),
('4',N'Đại diện cho tính cách thực tế, kiên nhẫn và động lực.'),
('5',N'Biểu thị sự phiêu lưu, tò mò và sự tự do.'),
('6',N'Đại diện cho tính cách yêu thương, tình cảm và sự chăm sóc.'),
('7',N'Biểu thị tính tò mò, trí tuệ và khả năng nghiên cứu.'),
('8',N'Đại diện cho tính cách quyền lực, tham vọng và sự thành công về tài chính.'),
('9',N'Biểu thị sự nhân ái, sáng suốt và khả năng tổng hợp.');

INSERT INTO CK( SoCK, ND, BienPhap, TinhYeu)
VALUES 
('1',N'Có khả năng tự lập và độc lập cao, điềm tĩnh trong tình huống áp lực, và thường được người khác tôn trọng vì tinh thần lãnh đạo của mình. Họ cũng thường có tài năng sáng tạo và sự quyết tâm để đạt được mục tiêu trong cuộc sống.'
,N'Tránh stress và lo lắng quá mức: Stress và lo lắng có thể ảnh hưởng đến sức khỏe tâm lý và thể chất của bạn. Hãy tìm cách giảm stress bằng cách tập thể dục, thực hành yoga, meditate, hoặc tham gia các hoạt động thư giãn khác.',
N'Những người có số chu kỳ vận số 1 thường rất quyết đoán và độc lập. Bạn có thể có xu hướng tự tin và thích gây ấn tượng, và thường tìm kiếm mối quan hệ tình cảm đầy thử thách và sự cạnh tranh. Bạn cũng có thể cảm thấy khó khăn khi phải chia sẻ quyền lực trong mối quan hệ.'),

('2',N'có khả năng tương tác xã hội tốt, có khả năng tạo ra mối quan hệ tốt với mọi người xung quanh, và thường được đánh giá cao vì tính cách thân thiện và hòa nhã của mình. Họ cũng thường có khả năng giải quyết mâu thuẫn và tìm ra giải pháp tốt nhất cho các tình huống khó khăn.'
,N'Tránh những quyết định lớn trong thời gian này: Tránh đưa ra những quyết định lớn như kết hôn, chuyển việc, hoặc mua nhà trong thời gian này nếu không cần thiết. Hãy đợi đến khi bạn có tâm trí và tinh thần ổn định hơn.',
N'Những người có số chu kỳ vận số 2 thường rất nhân từ và tình cảm. Bạn cảm thấy thoải mái khi được bao quanh bởi tình yêu và sự quan tâm của người khác, và thường tìm kiếm mối quan hệ lâu dài và ổn định. Tuy nhiên, Bạn cũng có thể cảm thấy khó khăn khi phải đối mặt với sự phản đối hoặc xung đột trong mối quan hệ.'),

('3',
N'Người có số vận hạn là 3 có thể gặp khó khăn trong việc tập trung và hoàn thành một công việc. Họ có thể dễ bị xao nhãng bởi những ý tưởng mới mẻ và có thể thiếu kiên nhẫn khi đối mặt với những trở ngại và khó khăn trong cuộc đời.',
N'Tránh sự xung đột và tranh cãi: Cố gắng giữ mối quan hệ với những người xung quanh bằng cách tránh xung đột và tranh cãi. Hãy giữ tinh thần bình tĩnh và thấu hiểu lập trường của người khác.',
N'Những người có số chu kỳ vận số 3 thường rất quan tâm đến việc kết nối với người khác thông qua tình yêu, lãng mạn và sáng tạo. Bạn có thể cảm thấy thoải mái khi được truyền cảm hứng và khám phá cùng người bạn đời, và thường tìm kiếm mối quan hệ tình cảm đầy màu sắc và đa dạng. Tuy nhiên, Bạn cũng có thể cảm thấy khó khăn khi phải đối mặt với sự thiếu nhất quán và thất vọng trong mối quan hệ.'),

('4',
N'Người có số vận hạn là 4 có thể gặp khó khăn trong việc thích nghi với những thay đổi và thử thách trong cuộc đời. Họ có thể cảm thấy bị hạn chế bởi sự cứng nhắc và có thể khó khăn trong việc thay đổi hành động và suy nghĩ.',
N'Tránh mạo hiểm và đầu tư quá nhiều: Tránh mạo hiểm và đầu tư quá nhiều trong thời gian này, đặc biệt là trong các loại đầu tư rủi ro cao. Hãy đầu tư thông minh và cân nhắc kỹ trước khi quyết định đầu tư vào bất kỳ thứ gì.',
N'Những người có số chu kỳ vận số 4 thường rất cần sự ổn định và an toàn trong mối quan hệ. Bạn có thể có xu hướng khá bảo thủ và kiểm soát, và thường tìm kiếm mối quan hệ tình cảm đầy trách nhiệm và tôn trọng. Tuy nhiên, Bạn cũng có thể cảm thấy khó khăn khi phải đối mặt với sự thay đổi và sự không ổn định trong mối quan hệ.'),

('5',
N'Người có số vận hạn là 5 có thể gặp khó khăn trong việc kiểm soát bản thân và tránh những thói quen xấu. Họ có thể dễ bị phân tâm và có thể cảm thấy khó khăn trong việc giữ được sự ổn định trong cuộc sống.',
N'Tránh lãng phí và chi tiêu quá mức: Hãy cẩn thận trong việc chi tiêu và tránh lãng phí tiền bạc trong thời gian này. Hãy lập kế hoạch chi tiêu hợp lý và cân nhắc kỹ trước khi mua bất kỳ sản phẩm hoặc dịch vụ nào.',
N'Những người có số chu kỳ vận số 5 thường rất tò mò và thích khám phá. Bạn có thể có xu hướng không ổn định và khó kiểm soát, và thường tìm kiếm mối quan hệ tình cảm đầy phiêu lưu và thử thách. Tuy nhiên, Bạn cũng có thể cảm thấy khó khăn khi phải đối mặt với sự cam kết và sự ổn định trong mối quan hệ.'),

('6',
N'có tình cảm gia đình rất sâu sắc, có khả năng gìn giữ và bảo vệ mối quan hệ tình cảm, và có tâm hồn nhân đạo, giúp đỡ người khác trong những tình huống khó khăn. Họ cũng thường có tài năng sáng tạo và khả năng đưa ra quyết định tốt trong cuộc sống.',
N'Tránh quá tự tin và kiêu ngạo: Hãy cẩn thận với tư duy quá tự tin và kiêu ngạo. Hãy luôn cởi mở và học hỏi từ người khá',
N'Những người có số chu kỳ vận số 6 thường rất đam mê và quan tâm đến việc xây dựng mối quan hệ tình cảm vững chắc và lâu dài. Bạn có thể có xu hướng nhạy cảm và chăm sóc người khác hơn là chăm sóc bản thân, và thường tìm kiếm mối quan hệ tình cảm đầy yêu thương và chân thành. Tuy nhiên, Bạn cũng có thể cảm thấy khó khăn khi phải đối mặt với sự không công bằng và sự kiểm soát trong mối quan hệ.'),

('7',
N'Người có số vận hạn là 7 có thể cảm thấy cô đơn hoặc bị bỏ rơi trong việc tìm kiếm ý nghĩa cuộc sống. Họ có thể bị đánh lừa bởi sự hoang đường và có thể gặp khó khăn trong việc kết nối với người khác và giao tiếp một cách hiệu quả.',
N'Tránh trì hoãn và lười biếng: Hãy cố gắng hoàn thành các nhiệm vụ trong thời gian đã định và tránh trì hoãn hay lười biếng. Hãy lập kế hoạch và tổ chức thời gian hợp lý.',
N'Những người có số chu kỳ vận số 7 thường rất tập trung vào việc khám phá thế giới tâm linh và tìm kiếm sự hiểu biết sâu sắc về bản thân. Bạn có thể có xu hướng cô độc và khó gần, và thường tìm kiếm mối quan hệ tình cảm đầy định hướng và chân thành. Tuy nhiên, Bạn cũng có thể cảm thấy khó khăn khi phải đối mặt với sự thiếu kiên nhẫn và sự khó hiểu trong mối quan hệ.'),

('8',
N'Số này được coi là một trong những số may mắn nhất, vì nó mang lại sự giàu có và thịnh vượng. Số 8 thường được sử dụng trong kinh doanh và tài chính vì nó được liên kết với tiền tài và sự thịnh vượng.',
N'Người có số vận hạn là 8 có thể gặp khó khăn trong việc giữ vững sự cân bằng giữa công việc và cuộc sống cá nhân. Họ có thể trở nên quá tập trung vào tiền bạc và đưa ra những quyết định thiếu suy nghĩ.',
N'Những người có số chu kỳ vận số 8 thường rất tập trung vào việc thành công và tiền bạc. Bạn có thể có xu hướng quá tập trung vào công việc và thiếu thời gian cho mối quan hệ tình cảm. Tuy nhiên, nếu Bạn quyết tâm xây dựng mối quan hệ, Bạn sẽ đưa ra một nỗ lực rất lớn để đảm bảo rằng mối quan hệ đó đầy đủ tình cảm và ổn định. Bạn tìm kiếm mối quan hệ tình cảm đầy định hướng và đồng thuận, nhưng đôi khi có thể trở nên quá khắt khe và kiểm soát trong mối quan hệ'),

('9',
N'Số này được liên kết với sự hoàn thiện và sự thành công. Nó cũng được coi là một con số may mắn trong tình yêu và hôn nhân, vì nó đại diện cho tình yêu và sự chung thủy.',
N'Người có số vận hạn là 9 có thể có khuynh hướng tự ái và cảm thấy mình là người độc đoán. Họ có thể gặp khó khăn trong việc chấp nhận sự thay đổi và phải đối mặt với những điều không như mong đợi.',
N'Những người có số chu kỳ vận số 9 thường rất đam mê và có tình cảm sâu sắc. Bạn có thể có xu hướng lãng mạn và tìm kiếm mối quan hệ tình cảm đầy yêu thương và cảm thông. Tuy nhiên, Bạn cũng có thể cảm thấy khó khăn khi phải đối mặt với sự không công bằng và thiếu hiểu biết trong mối quan hệ. Bạn cần tìm một người đối tác đủ thông minh và đáng tin cậy để chia sẻ mối quan tâm của mình và đồng cảm với Bạn.');


INSERT INTO soChuDao(SoCD, NDCD, DiemManh, DiemYeu, TinhCach)
VALUES
('1', N'Đại diện cho sự độc lập, quyết đoán, sáng tạo và lãnh đạo. Những người có số 1 trong thần số học thường có tính cách quyết đoán, quyền lực và khả năng lãnh đạo tốt. Họ có thể có xu hướng thiếu linh hoạt và cứng nhắc, nhưng cũng có thể trở nên rất độc lập và tự tin trong việc đưa ra quyết định.',
N'Sự độc lập, quyết đoán và tập trung. Họ có tinh thần lý trí, sáng tạo và giỏi lãnh đạo. Sự độc lập giúp họ đạt được thành công trong cuộc sống.', 
N'Tính cô đơn, cứng đầu và khó thích nghi. Bạn có thể không thích làm việc theo nhóm và khó thích nghi với môi trường mới.', 
N'Mạnh mẽ - Độc lập - Tự Tin'),

('2', 
N'Biểu thị sự hợp tác, nhân từ, cảm thông và sự cân bằng. Những người có số 2 trong thần số học thường có tính cách hòa đồng, nhân từ và có khả năng tương tác xã hội tốt. Họ có thể dễ bị ảnh hưởng bởi những ý kiến của người khác và có thể cảm thấy bất an khi phải đối mặt với sự mâu thuẫn.', 
N'Sự hợp tác, nhạy cảm và thấu hiểu. Bạn có tinh thần lãnh đạo, chăm sóc và giúp đỡ người khác. Bạn tạo ra mối quan hệ tốt và thường được yêu mến.', 
N'Tính phụ thuộc, nhút nhát và quá nhạy cảm. Bạn có thể quá phụ thuộc vào người khác, dễ cảm thấy bị tổn thương và thiếu sự tự tin.', 
N'Lắng nghe - Khéo léo - Nhạy cảm' ),

('3', 
N'Biểu thị sự sáng tạo, trí tuệ, khả năng giao tiếp và sự cởi mở. Những người có số 3 trong thần số học thường có tính cách sáng tạo, hài hước và có khả năng giao tiếp tốt. Họ có thể có xu hướng nói quá và thiếu kiên nhẫn, nhưng cũng có thể trở nên rất tinh tế và năng động trong công việc.', 
N'Sự sáng tạo, truyền cảm hứng và giao tiếp tốt. Bạn có tinh thần lạc quan, thông minh và có khả năng truyền cảm hứng cho người khác. Bạn tạo ra những ý tưởng mới và động lực cho người khác.', 
N'Tính bất ổn, khó tập trung và thiếu kiên nhẫn. Bạn có thể khó kiểm soát được cảm xúc và tâm trạng, dễ bị phân tâm và thiếu kiên nhẫn để đạt được mục tiêu.', 
N'Sáng tạo - Hoạt bát  - Lạc Quan' ),

('4', 
N'Biểu thị sự ổn định, kiên nhẫn, sự kiểm soát và sự chăm chỉ. Những người có số 4 trong thần số học thường có tính cách chăm chỉ, có khả năng kiểm soát tốt và có trách nhiệm cao. Họ có thể có xu hướng quá nghiêm túc và khó thích nghi, nhưng cũng có thể trở nên rất đáng tin cậy và kiên trì trong công việc.', 
N'Sự ổn định, kiên trì và đáng tin cậy. Bạn có tinh thần thực tế và làm việc chăm chỉ để đạt được mục tiêu. Sự đáng tin cậy giúp Bạn được tôn trọng và được người khác tin tưởng.', 
N'Tính cứng đầu, bảo thủ và ích kỷ. Bạn có thể không chấp nhận được thay đổi và khó chấp nhận những ý kiến khác, làm cho bạn trở nên bảo thủ và ích kỷ.', 
N'Cẩn thận - Cầu toàn - Thực tế' ),

('5', 
N'Biểu thị sự phiêu lưu, sự thích thú và sự tự do. Những người có số 5 trong thần số học thường có tính cách năng động, thích phiêu lưu và có khả năng thích nghi tốt. Họ có thể có xu hướng thiếu kiên nhẫn và không ổn định, nhưng cũng cóthể trở nên rất sáng tạo và có tầm nhìn rộng lớn trong cuộc sống.', 
N'Sự thay đổi và tự do. Bạn có tinh thần phiêu lưu, tò mò và muốn khám phá những điều mới mẻ. Sự tự do giúp bạn đạt được độc lập và thành công.', 
N'Tính bất ổn và thiếu trách nhiệm. Bạn có thể thiếu trách nhiệm và dễ bị phân tâm vì muốn khám phá những điều mới. Tính bất ổn làm cho bạn khó kiểm soát được cảm xúc và tâm trạng.', 
N'Năng động - Linh Hoạt - Tò mò' ),

('6', 
N'Biểu thị sự tình cảm, sự quan tâm và sự hướng nội. Những người có số 6 trong thần số học thường có tính cách tình cảm, quan tâm và sáng suốt. Họ có thể có xu hướng quá nhạy cảm và thiếu tự tin, nhưng cũng có thể trở nên rất đáng tin cậy và chăm sóc người khác.', 
N'Sự yêu thương, quan tâm và tình cảm. Bạn có tinh thần hướng nội, chăm sóc và quan tâm đến người khác. Bạn là người thấu hiểu và thường được yêu mến', 
N'Tính cảm động và ghen tuông. Bạn có thể dễ cảm động và khó kiểm soát được cảm xúc. Tính ghen tuông có thể khiến bạn khó chấp nhận được sự thay đổi và cảm thấy bị mất kiểm soát.', 
N'Quan tâm - Yêu thương - Kiểm soát' ),

('7', 
N'Biểu thị sự tập trung, sự khám phá và sự sâu sắc. Những người có số 7 trong thần số học thường có tính cách tập trung, sâu sắc và có khả năng khám phá tốt. Họ có thể có xu hướng cô đơn và cảm thấy bất an, nhưng cũng có thể trở nên rất thông minh và suy nghĩ sâu sắc.', 
N'Sự tập trung, sâu sắc và tò mò. Bạn có tinh thần lý trí, sáng tạo và khả năng tập trung vào mục tiêu. Bạn là người sâu sắc và muốn tìm hiểu những điều mới mẻ.', 
N'Tính cô đơn và khó gần gũi. Bạn có thể khó giao tiếp và khó thích nghi với môi trường mới. Tính cô đơn có thể khiến bạn cảm thấy bị cách biệt và cảm thấy buồn chán.', 
N'Thông thái - Khám phá - Truyền đạt' ),

('8', 
N'Biểu thị sự quyền lực, sự thịnh vượng và sự thành công. Những người có số 8 trong thần số học thường có tính cách quyền lực, thịnh vượng và đầy năng lượng. Họ có thể có xu hướng quá tự tin và khó thấu hiểu, nhưng cũng có thể trở nên rất giàu có và thành công trong cuộc sống.', 
N'Sự quyền lực, thực tế và thành công. Bạn có tinh thần lãnh đạo và đam mê để đạt được thành công. Sự thực tế giúp bạn đưa ra những quyết định đúng đắn và đạt được kết quả tốt.', 
N' Tính kiêu ngạo và tham lam. Bạn có thể cảm thấy kiêu ngạo với quyền lực và thành công của mình. Tính tham lam có thể khiến bạn bị mất kiểm soát và không có giới hạn.', 
N'Công bằng - Tập trung - Lý tưởng' ),

('9', 
N'Biểu thị sự cao thượng, sự tử tế và sự phục vụ. Những người có số 9 trong thần số học thường có tính cách cao thượng, tử tế và sẵn sàng phục vụ người khác. Họ có thể có xu hướng quá hoàn mỹ và thiếu linh hoạt, nhưng cũng có thể trở nên rất nhân đức và có khả năng giúp đỡ người khác.', 
N' Sự hoàn thiện, hướng ngoại và nhân ái. Bạn có tinh thần hướng ngoại và muốn giúp đỡ những người khác. Bạn là người có tình yêu thương và sự nhân ái, và muốn giúp đỡ những người gặp khó khăn.', 
N'Tính cảm xúc và thiếu kiên nhẫn. Bạn có thể dễ bị ảnh hưởng bởi cảm xúc và khó kiểm soát được tâm trạng. Tính thiếu kiên nhẫn có thể khiến bạn dễ nản lòng và không kiên trì đến cùng.', 
N'Trách nghiệm - Rộng lượng - Hào phóng' ),

('11', 
N'sự đam mê và sự độc lập. Những người có con số chủ đạo là 11 thường có tầm nhìn rộng và muốn khám phá những điều mới mẻ. Họ thường tỏ ra mạnh mẽ, quyết đoán và độc lập trong suy nghĩ và hành động.', 
N'Sự sáng tạo và trực giác. Bạn có tinh thần sáng tạo, trực giác và có khả năng nhìn thấy những điều bên trong đằng sau bề ngoài. Bạn là người có tầm nhìn rộng và đam mê khám phá những điều mới mẻ.', 
N'Tính nhạy cảm và bất ổn. Bạn có thể dễ cảm động và khó kiểm soát được tâm trạng. Tính bất ổn có thể khiến bạn dễ bị phân tâm và khó tập trung vào mục tiêu của mình.', 
N'Cẩn thận - Cầu toàn - Thực tế' );


INSERT INTO TaiKhoan(TK,MK,ChucVu,Email, Ten, Ngay, Thang,Nam, SLTraCuu)
VALUES 
('cun123', '123', 'admin', 'PHAMPHUTAN@gmail.com', N'Phạm Phú Tân', '01', '02', '2003', '0'),
('sieucute', '123', 'user', 'thaivu@gmail.com', N'Phạm Phú Tân', '01', '02', '2003', '0');

INSERT INTO ThongTinNhap(EmailUser, Name, Ngay, Thang, Nam, Sex, SDT,FTK)
VALUES 
--('tranthib@gmail.com', 'Tran Thi B', '2', '3', '2003', 'Nu' ,'03251325','sieucute'),
--('tranthia@gmail.com', 'Tran Thi A', '2', '4', '2003', 'Nu' ,'03251325','sieucute'),
('example1@example.com', 'Nguyen Van A', '1', '1', '1990', 'Male', '12345890', 'sieucute'),
('example2@example.com', 'Nguyen Thi B', '15', '5','1985', 'Female', '09874321', 'sieucute'),
('example3@example.com', 'Tran Van C', '10', '12', '1995', 'Male', '98765210', 'sieucute'),
('example4@example.com', 'Le Thi D', '20', '3', '1988', 'Female', '01234589', 'sieucute'),
('example5@example.com', 'Pham Van E',' 5', '9', '1992', 'Male', '98765410', 'sieucute'),
('example6@example.com', 'Ho Thi F', '12', '7', '1997', 'Female', '01234589', 'sieucute'),
('example7@example.com', 'Do Van G', '25',' 11', '1983', 'Male', '12345670', 'sieucute'),
('example8@example.com', 'Nguyen Thi H', '8', '4', '1994', 'Female', '09854321', 'sieucute'),
('example9@example.com', 'Tran Van I', '16','2',' 1999', 'Male', '01234589', 'sieucute'),
('example10@example.com', 'Le Thi J', '3',' 10', '1987', 'Female', '98765410', 'sieucute');

INSERT INTO ThongTinHienThi(IDSCD, IDCK, IDThongTinNhap, NgayTraCuu)
VALUES
('1', '3', '1', '2023-05-21'),
('2', '4', '2', '2023-05-21');





