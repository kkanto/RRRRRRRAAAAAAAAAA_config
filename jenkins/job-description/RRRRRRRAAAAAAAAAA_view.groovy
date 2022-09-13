 
listView('RRRRRRRAAAAAAAAAA Jobs') {
    description('RRRRRRRAAAAAAAAAA Jobs')
    jobs {
        regex('RRRRRRRAAAAAAAAAA_.+')
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
