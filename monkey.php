<?php

/**
 * PHP版猴子问题
 */


for ($i = 0; $i < 20; $i++) {
    $apes[$i] = 20;
}

for ($i = 0; $i < 365 * 20; $i++) {
    for ($j = 0; $j < sizeof($apes); $j++) {
        if ($apes[$j] != 0) {
            $apes[$j] -= 1;
            $apes[god(0,sizeof($apes) - 1, $j)] += 1;
        }
    }
}

function god($min, $max, $exclude) {
    do {
        $i = random_int($min, $max);
    } while( $i == $exclude);
    return $i;
}

for ($i = 0; $i < sizeof($apes); $i++) {
    echo str_repeat('_',$apes[$i]),$apes[$i],"\n";
}
