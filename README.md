# Пример выполнения мобильного тестирования с инструментом Browserstack
## :unicorn: Pet-projects: мобильное плидложение Wikipedia
1. Из открытого источника взят установщик мобильного приложения:  <a target="_blank" href="https://github.com/wikimedia/apps-android-wikipedia/releases/tag/latest">wikimedia/apps-android-wikipedia</a>
2. Установщик загружен в demo-учетную запись <a target="_blank" href="https://www.browserstack.com/">BrowserStack</a> (сервис платный)
3. Выбран эмулятор мобильного устройства (в данном примере это телефон Samsung Galaxy S21, OS 11.0)
4. Добавлен код теста, проверяющий работу поиска по wikipedia (в данном примере заводим в посик Википедии термин BrowserStack)
5. Получаем результаты теста в фомате Allure отчета
6. Добавлены артефакты тестирования (скриншот и видео) 

## :four_leaf_clover: Allure 
###### Главный экран Allure отчета (Owerwiev)
<p align="center">
<img title="Allure Graphics" src="img/add_allure1.jpg"  width="600" >
</p>
###### Страница Allure с проведенными тестами (Suites)
<p align="center">
<img title="Allure Graphics" src="img/add_allure2.jpg"  width="600">
</p>

## :watermelon: Скриншот прохождения тестов
К каждому тесту (в отчете) прилагается автоматически сгенерирванный скриншот. Пример:
<p align="center">
  <img title="Screenshot" src="img/add_browserstack_com_Wiki_last_screen.png" width="300" alt="Screenshot">
</p>

## :watermelon: Видео прохождения тестов
К каждому тесту прилагается автоматически сгенерирванное видео. Пример:
<p align="center">
  <img title="Video" src="img/add_browserstack_com_Wiki_video.gif"  width="300"  alt="Video">
</p>

-------
ver1 2022-04-28
