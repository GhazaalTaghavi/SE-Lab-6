# SE-Lab-6
- الگوی Self Encapsulate Field که در شکل‌های زیر قابل مشاهده می‌باشد به این صورت است که متغییر به صورت پاپلیک تعریف شده بود و استفاده می‌شد که برای آن تابع Getter تعریف شد
![Screenshot (1099)](https://github.com/GhazaalTaghavi/SE-Lab-6/assets/62201018/328c61e3-1b1b-4859-a267-26c6876ec629)
![Screenshot (1100)](https://github.com/GhazaalTaghavi/SE-Lab-6/assets/62201018/df251277-e62d-4853-a756-3a949b4dae89)
![Screenshot (1101)](https://github.com/GhazaalTaghavi/SE-Lab-6/assets/62201018/e4fdf0cf-4216-4905-b798-017a1a043ed7)
![Screenshot (1102)](https://github.com/GhazaalTaghavi/SE-Lab-6/assets/62201018/bbaa32e8-b12a-4fe9-93de-bdc44ab6983c)
![Screenshot (1103)](https://github.com/GhazaalTaghavi/SE-Lab-6/assets/62201018/77510263-af10-452e-99d2-883359612814)
- الگوی Extract Method در شکل زیر قابل مشاهده می‌باشد و به این صورت است که در تابع Constructor این کلاس متغییر‌های مقداردهی شده بودند که بهتر بود به یک تایع دیگر منتقل شوند
![Screenshot (1104)](https://github.com/GhazaalTaghavi/SE-Lab-6/assets/62201018/80590c1d-5cb4-4049-b1f5-613726e55618)
- الگو Facade در شکل زیر قابل مشاهده می‌باشد و به این صورت است که یک کلاس دیگر برای مدیریت کلاس Paser اضافه شده است
![Screenshot (1105)](https://github.com/GhazaalTaghavi/SE-Lab-6/assets/62201018/1b8f08b5-2ca7-47d9-88ab-f82ec4e08488)
- الگو Singleton Pattern در شکل‌های زیر قابل مشاهده می‌باشد و به این صورت است که یک اینتسن برای استفاده از آن گرفته شده و استفاده می‌شود
![Screenshot (1106)](https://github.com/GhazaalTaghavi/SE-Lab-6/assets/62201018/9d74d04c-ebe9-4c77-a78c-382c062a4f77)
![Screenshot (1107)](https://github.com/GhazaalTaghavi/SE-Lab-6/assets/62201018/a4e17edf-20bf-4d9c-8443-6d7d279f714f)
![Screenshot (1108)](https://github.com/GhazaalTaghavi/SE-Lab-6/assets/62201018/e9a67361-4acc-4e54-8465-1f9fce8372c1)
![Screenshot (1109)](https://github.com/GhazaalTaghavi/SE-Lab-6/assets/62201018/6f022c3d-df7f-49f3-8367-763b350a2d50)
![Screenshot (1110)](https://github.com/GhazaalTaghavi/SE-Lab-6/assets/62201018/56c1db17-de52-45b9-a297-2aea05d15256)
![Screenshot (1111)](https://github.com/GhazaalTaghavi/SE-Lab-6/assets/62201018/3d2c2293-fba6-49b2-86f1-989fd22bc9e2)
![Screenshot (1112)](https://github.com/GhazaalTaghavi/SE-Lab-6/assets/62201018/b902d759-f1e6-4655-a939-35ec58be2ec1)
- الگوی separate query from modifier در شکل زیر قابل مشاهده می‌باشد و به این صورت است که اگر در یک متد هم مقداری بازگشت داده می‌شود و هم تغییری روی یک متغیر انجام شود نیاز است که برای آن تغییر تابعی مجزا تعریف شود.
![Screenshot (1113)](https://github.com/GhazaalTaghavi/SE-Lab-6/assets/62201018/0efc844a-21af-488c-8b84-e4c77f1dafd3)
- الگوی Replace Conditional with Polymorphism در شکل زیر قابل مشاهده می‌باشد و بدین صورت است که یک switch را به چنددین کلاس تبدیل کردیم
![Screenshot (1114)](https://github.com/GhazaalTaghavi/SE-Lab-6/assets/62201018/c908c747-2d76-4ea1-a185-bbd671ee7552)
![Screenshot (1115)](https://github.com/GhazaalTaghavi/SE-Lab-6/assets/62201018/3af8893a-75ee-4f83-a5f0-0888e4a0dc79)

-پرسش‌ها:
-پرسش اول:
-کد تمیر: کد تمیز، به کدی گفته می شود که در آن از اصول و تکنیک‌هایی استفاده شده باشد که قابلیت خوانایی، نگهداری و توسعه‌پذیری کد را افزایش بدهد. که شامل نامگذاری، ساختاردهی مناسب، استفاده از اصول ریکفتور و....
-بدهی فنی: به معنای آن است که در کد یا طراحی برنامه یا معماری برنامه مشکلات و نقایص فنی جمع شده اند و در آینده مشکلات جدی‌تری ایجاد می کنند. که دلیل این مورد می توان به عدم انتخاب مناسب راه حل یا درست کردن مشکلات به صورت غیر اصولی و... اشاره نمود
بوی بد: حس نامطلوبی که از کد حس می کنیم به آن اصطاحا می گویند بوی بد. که مشخص می‌شود که کد دارای مشکلات فنی و عدم تمیزی است و نیاز به ریفکتور دارد
پرسش دوم:
کدهای متورم (Bloaters): این دسته در واقع تکه کدهایی (متد، کلاس و ...) هستند که به دلیل بزرگی بیش از اندازه عملا امکان کار با آن‌ها وجود ندارد. این بخش‌های بزرگ کد معمولا با توسعه تدریجی محصول ایجاد و روی هم انباشته می‌شوند. مانند: متدهای بلند (Long method)، کلاس‌های بزرگ (Large class)، وسواس استفاده از متغیرهای داده‌ای اولیه (Primitive obsession)، توده داده (Data clumps) و...
بد استفاده کنندگان از شیء گرایی (Object orientation abusers): تکه کدهای این بخش در واقع بد استفاده کنندگاه یا ناقص استفاده کنندگان از اصول شیء گرایی هستند. مانند: گذاره‌های switch، درخواست رد شده (Refused request)، فیلد موقتی (Temporary field) و...
جلوگیری کنندگان از تغییر(Change preventers): این نشانه‌ها حاکی از این دارند زمانیکه تغییری در یک بخش کد نیاز باشد، در راستای آن حتما باید دیگر بخش‌های کد نیز به مقدار زیادی تغییر کنند. در این حالات اعمال تغییرات و نگهداری کد به شدت سخت خواهد شد. مانند: تغییر واگرا (Divergent change)، Shotgun Surgery، سلسله مراتب موازی ارث بری (Parallel inheritance hierarchy) و...
کدهای غیر ضروری (Dispensables): این دسته از کدها معمولا کدهایی هستند بی دلیل و بی استفاده. کدهایی که نبودنشان بهتر از بودنشان است! حذف کردن این کدها به خوانایی و قابلیت نگهداری کد خواهد افزود. مانند: کامنت، کد تکراری، کلاس داده (ِData class)، کلاس تنبل (Lazy class)، کد مرده (Dead code) و...
کدهایی بیش از اندازه وابسته به هم (Couplers): کدهایی که در این دسته قرار می‌گیرند معمولا یا خود درگیر یک وابستگی شدید هستند یا به ایجاد وابستگی بین کلاس‌ها کمک می‌کنند. مانند: متد حسود (Feature envy)، کلاس‌های بیش از اندازه صمیمی (Inappropriate Intimacy)، کتابخانه‌های ناقص (Incomplete Library Class)، زنجیره فراخوانی‌ها (Message chain) و...
پرسش سوم:
همانطور که بالاتر هم اشاره شد در دسته کدهای غیر ضروری (Dispensables) قرار می گیرد
توابع و متدهای جداگانه (Separate Methods) یا کلاس‌های کمکی (Helper Classes) برای کاهش تکرار در کد استفاده کنید.
گاهی اوقات یک کلاس تنبل به منظور ترسیم اهداف توسعه آینده ایجاد می شود، در این مورد، سعی کنید تعادلی بین وضوح و سادگی در کد خود حفظ کنید.
