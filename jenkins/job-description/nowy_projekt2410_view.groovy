 
listView('nowy_projekt2410 Jobs') {
    description('nowy_projekt2410 Jobs')
    jobs {
        regex('nowy_projekt2410_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
