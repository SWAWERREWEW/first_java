# Изучаемый курс
https://youtu.be/Z6RGsOTYxEU?si=c-UcWhcpKfSBKboW

# Для запуска нужно
```
Создать в корне репозитория папку out
Навести курсор на src
Правая кнопка мыши
Open Module Settings
Modules
Вкладка Sources
Выбрать папку src
Нажать на кнопку Sources в строке с "Mark as:"
Apply

alt + f
Build
Build Project

alt + f
Project Structure...
Language level: SDK Default
```

## компилировать тогда нужно будет так:
javac com/company/Main.java

## А запускать так:
java com/company/Main

# Прочее
    git rm --cached .idea/misc.xml
    git rm --cached sitewomen\db.json

    git rm -r --cached .idea
    git rm -r -f --cached .idea

    откатить коммит, сохранив изменения в индексе
    git reset --soft HEAD~1

    убрать файл из индекса
    git reset HEAD sitewomen\sitewomen\settings.py
    git reset HEAD sitewomen\db.json

    создать новый коммит с тем же сообщением
    git commit -c ORIG_HEAD

    выход из окна редактирования
    :wq

    отправка на github
    git push origin main --force
